package com.gf.view;

import com.gf.entities.Job;
import com.gf.logic.ResourceIO;
import com.gf.logic.events.JobSelectEventHandler;
import javax.swing.ImageIcon;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class JobSelectPanel extends javax.swing.JPanel {

    private final JobSelectEventHandler eventHandler = new JobSelectEventHandler();
    private Job job;

    /**
     * Creates new form JobSelectPanel
     */
    public JobSelectPanel() {
        initComponents();
    }

    public void setJob(Job job) {
        this.job = job;
        updateJob();
    }

    public Job getJob() {
        return this.job;
    }

    private void updateJob() {
        fieldTitle.setText(this.job.getTitulo());
        fieldLocation.setText(this.job.getLocalidad() + ", " + this.job
                .getProvincia());
        fieldFont.setText(this.job.getFuente());
        fieldDescription.setText("<html><head></head><body>" + this.job
                .getDescripcion() + "</body></html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fieldTitle = new javax.swing.JLabel();
        fieldLocation = new javax.swing.JLabel();
        fieldFont = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldDescription = new javax.swing.JTextPane();
        buttonDeny = new javax.swing.JLabel();
        buttonAccept = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        setMaximumSize(new java.awt.Dimension(255, 435));
        setMinimumSize(new java.awt.Dimension(255, 435));
        setOpaque(false);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        fieldTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fieldTitle.setText("<Titulo empleo>");

        fieldLocation.setText("<Ubicacion>");

        fieldFont.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        fieldFont.setText("<Fuente>");

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        fieldDescription.setBorder(null);
        fieldDescription.setContentType("text/html"); // NOI18N
        fieldDescription.setForeground(new java.awt.Color(64, 64, 64));
        fieldDescription.setCaretColor(new java.awt.Color(64, 64, 64));
        fieldDescription.setDisabledTextColor(new java.awt.Color(64, 64, 64));
        fieldDescription.setEnabled(false);
        fieldDescription.setOpaque(false);
        jScrollPane1.setViewportView(fieldDescription);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldLocation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldFont, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldLocation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(fieldFont)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonDeny.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDeny.setIconTextGap(0);
        buttonDeny.setMaximumSize(new java.awt.Dimension(64, 64));
        buttonDeny.setMinimumSize(new java.awt.Dimension(64, 64));
        buttonDeny.setPreferredSize(new java.awt.Dimension(64, 64));
        buttonDeny.setIcon(new ImageIcon(ResourceIO.resourceImage("images/cancel128.png", buttonDeny.getWidth() < 1 ? 64 : buttonDeny.getWidth(), buttonDeny.getHeight() < 1 ? 64 : buttonDeny.getHeight())));
        buttonDeny.addMouseListener(formListener);

        buttonAccept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAccept.setIconTextGap(0);
        buttonAccept.setMaximumSize(new java.awt.Dimension(64, 64));
        buttonAccept.setMinimumSize(new java.awt.Dimension(64, 64));
        buttonAccept.setPreferredSize(new java.awt.Dimension(64, 64));
        buttonAccept.setIcon(new ImageIcon(ResourceIO.resourceImage("images/checked128.png", buttonAccept.getWidth() < 1 ? 64 : buttonAccept.getWidth(), buttonAccept.getHeight() < 1 ? 64 : buttonAccept.getHeight())));
        buttonAccept.addMouseListener(formListener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.MouseListener {
        FormListener() {}
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == buttonDeny) {
                JobSelectPanel.this.buttonDenyMouseReleased(evt);
            }
            else if (evt.getSource() == buttonAccept) {
                JobSelectPanel.this.buttonAcceptMouseReleased(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAcceptMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAcceptMouseReleased
        if (eventHandler.clickAccept(this.getJob())) {
            this.setJob(eventHandler.requestNextJob());
        }
    }//GEN-LAST:event_buttonAcceptMouseReleased

    private void buttonDenyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDenyMouseReleased
        if (eventHandler.clickDeny(this.getJob())) {
            this.setJob(eventHandler.requestNextJob());
        }
    }//GEN-LAST:event_buttonDenyMouseReleased

    public void requestJob() {
        this.setJob(eventHandler.requestNextJob());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buttonAccept;
    private javax.swing.JLabel buttonDeny;
    private javax.swing.JTextPane fieldDescription;
    private javax.swing.JLabel fieldFont;
    private javax.swing.JLabel fieldLocation;
    private javax.swing.JLabel fieldTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
