package com.gf.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.LineBorder;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class RoundedBorder extends LineBorder {

    private float arcSize = 0.2f;

    public RoundedBorder(Color color) {
        super(color);
    }

    public RoundedBorder(Color color, int thickness) {
        super(color, thickness);
    }

    public RoundedBorder(Color color, int thickness, boolean roundedCorners) {
        super(color, thickness, roundedCorners);
    }

    public RoundedBorder(Color color, int thickness, boolean roundedCorners, float arcSize) {
        super(color, thickness, roundedCorners);
        this.arcSize = arcSize;
    }

    public void setRoundingArc(float arc) {
        this.arcSize = arc;
    }

    public float getRoundingArc() {
        return this.arcSize;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if ((this.thickness > 0) && (g instanceof Graphics2D)) {
            Graphics2D g2d = (Graphics2D) g;

            Color oldColor = g2d.getColor();
            g2d.setColor(this.lineColor);

            Shape outer;
            Shape inner;

            int offs = this.thickness;
            int size = offs + offs;
            if (this.roundedCorners) {
                float arc = this.arcSize * offs;
                outer = new RoundRectangle2D.Float(x, y, width, height, offs, offs);
                inner = new RoundRectangle2D.Float(x + offs, y + offs, width - size, height - size, arc, arc);
            } else {
                outer = new Rectangle2D.Float(x, y, width, height);
                inner = new Rectangle2D.Float(x + offs, y + offs, width - size, height - size);
            }
            Path2D path = new Path2D.Float(Path2D.WIND_EVEN_ODD);
            path.append(outer, false);
            path.append(inner, false);
            g2d.fill(path);
            g2d.setColor(oldColor);
        }
    }

}
