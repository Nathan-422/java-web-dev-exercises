package exercises.technology;

public class SmartPhone extends Computer{

    private boolean isDisplayPowered;

    public SmartPhone() {
        this.isDisplayPowered = false;
    }

    public boolean isDisplayPowered() {
        return isDisplayPowered;
    }

    private void setDisplayPowered(boolean displayPowered) {
        isDisplayPowered = displayPowered;
    }

    public boolean toggleDisplayPower() {
        if (super.isPowered()) {

            if (super.isUnlocked()) {
                super.toggleLock();
            }

            this.setDisplayPowered(false);
        }

        return false;

    }

}
