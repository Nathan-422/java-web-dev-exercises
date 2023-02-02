package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {


    @Override
    public int compare(Cone cone, Cone t1) {

        double result = cone.getCost() - t1.getCost();
        if (result < 0) {
            return -1;
        } else if (result > 0) {
            return 1;
        }
        return 0;
    }
}
