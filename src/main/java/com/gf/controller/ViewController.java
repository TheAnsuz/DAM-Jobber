package com.gf.controller;

import com.gf.entities.Job;
import com.gf.logic.ResourceIO;
import com.gf.view.HomeScreen;
//import com.gf.view.InfoDialog;
import com.gf.view.JobInfoPanel;
import com.gf.view.JobSelectPanel;
import com.gf.view.LoginScreen;
import com.gf.view.RegisterScreen;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class ViewController {

    private final HomeScreen home;
    private final LoginScreen login;
    private final RegisterScreen register;
//    private final InfoDialog infoDialog;
    private final Icon errorIcon = new ImageIcon(ResourceIO
            .resourceImage("images/error.png", 64, 64));
    private final JobSelectPanel jobPanel;
    private final JobInfoPanel jobInfoPanel;

    private JPanel lastPanel = null;

    public ViewController() {
        this.jobPanel = new JobSelectPanel();
        this.jobInfoPanel = new JobInfoPanel();
        this.home = new HomeScreen();
//        this.infoDialog = new InfoDialog(home, true);
        this.login = new LoginScreen(home, true);
        this.register = new RegisterScreen(home, true);
//        this.home.setInteriorPanel(jobInfoPanel);
//        this.jobPanel.requestJob();
//        this.home.setInteriorPanel(this.jobPanel);
        this.home.setVisible(true);
//        Controller.getUser();
    }

    public void back() {
        if (lastPanel == null) {
            return;
        }

        this.home.setInteriorPanel(lastPanel);
    }

    public void showJobInfo(Job job) {
        this.jobInfoPanel.setJob(job);
        this.home.setInteriorPanel(jobInfoPanel);
        this.lastPanel = jobInfoPanel;
    }

    public void showJobData(Job job) {
//        System.out.println("Funsiona?");
        if (job == null) {
            this.jobPanel.requestJob();
        } else {
            this.jobPanel.setJob(job);
        }
        this.home.setInteriorPanel(jobPanel);
        this.lastPanel = jobPanel;
    }

    public void showLoginScreen() {
        this.login.setLocationRelativeTo(home);
        this.login.setVisible(true);
    }

    public void showRegisterScreen() {
        this.register.setLocationRelativeTo(home);
        this.register.setVisible(true);
    }

    public void showInfoDialog(String title, String... description) {
        JOptionPane
                .showMessageDialog(home, String.join("\n", description), title
                        .toUpperCase(), JOptionPane.INFORMATION_MESSAGE);
//        this.infoDialog.setTitle(title);
//        this.infoDialog.setDescription(description);
//        this.infoDialog.setLocationRelativeTo(null);
//        this.infoDialog.setVisible(true);
    }

    public void showInfoDialog(String... lines) {
        JOptionPane
                .showMessageDialog(home, String.join("\n", lines), "AVISO", JOptionPane.INFORMATION_MESSAGE);
//        this.infoDialog.setText(lines);
//        this.infoDialog.setLocationRelativeTo(null);
//        this.infoDialog.setVisible(true);
    }

    public void showWarning(String text) {
        JOptionPane
                .showMessageDialog(home, text, "ERROR", JOptionPane.ERROR_MESSAGE, errorIcon);
    }
}
