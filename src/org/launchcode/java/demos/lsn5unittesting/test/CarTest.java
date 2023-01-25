package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {

    Car testCar;

    @Before
    public void createCarObject() {
        testCar = new Car("Honda", "Accord", 12, 32);
    }

    // add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
//    @Test
//    public void emptyTest() {
//        assertEquals(10, 10, .001);
//    }
    // constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTankToBeFull() {
        assertEquals(12, testCar.getGasTankSize(), .001);
    }

    @Test
    public void testInitialGasTankToBeNotEmpty() {
        assertFalse(testCar.getGasTankLevel() == 0);
    }

    @Test
    public void testInitialGasTankADifferentWay() {
        assertTrue(testCar.getGasTankLevel() == 12);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    public void testGasTankLevelAfterDrivingCertainDistance() {
        testCar.drive(32);
        assertEquals(11, testCar.getGasTankLevel(), .01);
    }

    // gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankIsEmptyAfterDrivingPastRange() {
        testCar.drive(4000);
        assertEquals(0, testCar.getGasTankLevel(), .01);
    }


    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void carObjectThrowsExceptionWhenTryingToOverfillGasTank() {
        testCar.addGas(5);
        fail("I've made a huge mistake");
    }

}
