package exercises.technology;

import java.util.ArrayList;

public class Computer {

    private boolean powered;
    private boolean unlocked;
    private String activeApplication;
    private ArrayList<String> runningApplications;

    public Computer() {
        this.powered = false;
        this.unlocked = false;
        this.activeApplication = "DESKTOP";
        this.runningApplications = new ArrayList<>();
        this.runningApplications.add(this.activeApplication);
    }

    public boolean isPowered() {
        return powered;
    }

    private void setPowered(boolean powered) {
        this.powered = powered;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    private void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public String getActiveApplication() {
        return activeApplication;
    }

    private void setActiveApplication(String activeApplication) {
        this.activeApplication = activeApplication;
    }

    private ArrayList<String> getRunningApplications() {
        return runningApplications;
    }

    public boolean launchApplication(String app) {

        if (app == null || app.isBlank()) {
            return false;
        }

        if (this.getRunningApplications().contains(app)) {
            return false;
        }

        this.getRunningApplications().add(app);
        this.setActiveApplication(app);

        return true;
    }

    public boolean switchApplication(String app) {

        if (this.getRunningApplications().contains(app)) {
            this.setActiveApplication(app);
            return true;
        }

        return false;

    }

    public boolean killApplication(String app) {

        if (!this.getRunningApplications().remove(app)) {
            return false;
        }

        if (this.getActiveApplication().equals(app)) {
            this.setActiveApplication("DESKTOP");
        }

        if (app.equals("DESKTOP")) {
            this.runningApplications.add("DESKTOP");
        }

        return true;
    }

    public boolean powerOn() {
        if (!this.isPowered()) {
            this.setPowered(true);
            return true;
        }

        System.out.println("Computer is already on");
        return false;
    }

    public boolean toggleLock() {

        if (this.isUnlocked()) {
            this.setUnlocked(false);
        } else {

            String password = "PasswordFromUser";
            String userInput = "";

            // TODO get password from user to unlock computer
            System.out.println("Password:");

            if (userInput.equals(password)) {
                this.setUnlocked(true);
                return true;
            }
        }

        return false;
    }

}
