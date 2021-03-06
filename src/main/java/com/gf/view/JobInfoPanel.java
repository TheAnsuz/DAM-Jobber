package com.gf.view;

import com.gf.controller.Controller;
import com.gf.entities.Job;
import com.gf.logic.ResourceIO;
import com.gf.logic.events.JobInfoEventHandler;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class JobInfoPanel extends javax.swing.JPanel {

    private final JobInfoEventHandler eventHandler = new JobInfoEventHandler();

    private final static Icon exitIcon = new ImageIcon(ResourceIO
            .resourceImage("images/cross.png", 32, 32));
    private Job job;

    /**
     * Creates new form JobInfoPanel
     */
    public JobInfoPanel() {
        initComponents();
    }

    /**
     * Establece el trabajo que muestra este panel, no debe de ser nulo
     *
     * @param job el trabajo que muestra el panel
     */
    public void setJob(Job job) {
        this.job = job;
        this.updateJob();
    }

    /**
     * Obtiene el trabajo que esta mostrando el panel
     *
     * @return el trabajo mostrado
     */
    public Job getJob() {
        return this.job;
    }

    private void updateJob() {
        fieldIcon.setIcon(new ImageIcon(Controller.getConfiguration()
                .getDefaultImage(96, 96)));
        fieldTitle.setText(this.job.getTitulo());
        fieldFont.setText(this.job.getFuente());
        fieldLocation.setText(this.job.getLocalidad() + " : " + this.job
                .getProvincia());
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

        fieldIcon = new javax.swing.JLabel();
        fieldTitle = new javax.swing.JLabel();
        fieldLocation = new javax.swing.JLabel();
        buttonGoogleMaps = new javax.swing.JLabel();
        fieldFont = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldDescription = new javax.swing.JTextPane();

        FormListener formListener = new FormListener();

        setMinimumSize(new java.awt.Dimension(556, 518));
        setPreferredSize(new java.awt.Dimension(556, 518));

        fieldIcon.setIcon(new ImageIcon(Controller.getConfiguration().getDefaultImage(96, 96)));
        fieldIcon.setIconTextGap(0);

        fieldTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fieldTitle.setText("<Titulo extenso sobre el empleo que tiene una longitud maxima>");
        fieldTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        fieldLocation.setText("<Ubicacion>");

        buttonGoogleMaps.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        buttonGoogleMaps.setForeground(new java.awt.Color(102, 153, 255));
        buttonGoogleMaps.setText("Ver en Google maps");
        buttonGoogleMaps.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGoogleMaps.addMouseListener(formListener);

        fieldFont.setText("<Fuente del empleo>");

        jLabel2.setText("Proporcionado por: ");

        jLabel1.setIcon(exitIcon);
        jLabel1.setToolTipText("Cerrar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setIconTextGap(0);
        jLabel1.setMaximumSize(new java.awt.Dimension(32, 32));
        jLabel1.setMinimumSize(new java.awt.Dimension(32, 32));
        jLabel1.setPreferredSize(new java.awt.Dimension(32, 32));
        jLabel1.addMouseListener(formListener);
        jLabel1.addKeyListener(formListener);

        fieldDescription.setContentType("text/html"); // NOI18N
        fieldDescription.setForeground(new java.awt.Color(64, 64, 64));
        fieldDescription.setCaretColor(new java.awt.Color(64, 64, 64));
        fieldDescription.setDisabledTextColor(new java.awt.Color(64, 64, 64));
        fieldDescription.setEnabled(false);
        jScrollPane2.setViewportView(fieldDescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonGoogleMaps)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldFont, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldLocation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonGoogleMaps)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldFont))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.KeyListener, java.awt.event.MouseListener {
        FormListener() {}
        public void keyPressed(java.awt.event.KeyEvent evt) {
        }

        public void keyReleased(java.awt.event.KeyEvent evt) {
            if (evt.getSource() == jLabel1) {
                JobInfoPanel.this.jLabel1KeyReleased(evt);
            }
        }

        public void keyTyped(java.awt.event.KeyEvent evt) {
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == jLabel1) {
                JobInfoPanel.this.jLabel1MouseReleased(evt);
            }
            else if (evt.getSource() == buttonGoogleMaps) {
                JobInfoPanel.this.buttonGoogleMapsMouseReleased(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyReleased
        Controller.getView().back();
    }//GEN-LAST:event_jLabel1KeyReleased

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        eventHandler.clickBackButton(this.getJob());
    }//GEN-LAST:event_jLabel1MouseReleased

    private void buttonGoogleMapsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGoogleMapsMouseReleased
        eventHandler.clickGoogleButton(this.getJob());
    }//GEN-LAST:event_buttonGoogleMapsMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buttonGoogleMaps;
    private javax.swing.JTextPane fieldDescription;
    private javax.swing.JLabel fieldFont;
    private javax.swing.JLabel fieldIcon;
    private javax.swing.JLabel fieldLocation;
    private javax.swing.JLabel fieldTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
