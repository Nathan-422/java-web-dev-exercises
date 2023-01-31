package exercises.technology;

import java.util.ArrayList;
import java.util.HashMap;

public class Laptop extends Computer {

    private String powerPlan;
    private boolean isCharging;
    private ArrayList<String> powerPlans;

    public Laptop() {
        this.powerPlan = "BALANCED";
        this.isCharging = false;
        powerPlans.add("BALANCED");
        powerPlans.add("HIGH_PERFORMANCE");
        powerPlans.add("BATTERY_SAVER");
    }

    public String getPowerPlan() {
        return powerPlan;
    }

    public boolean isCharging() {
        return isCharging;
    }

    public void setPowerPlan(String powerPlan) {
        this.powerPlan = powerPlan;
    }

    private void setCharging(boolean charging) {
        isCharging = charging;
    }

    public boolean changePowerPlan(String plan) {
        if (this.powerPlans.contains(plan)) {
            this.setPowerPlan(plan);
            return true;
        }

        return false;
    }

}
