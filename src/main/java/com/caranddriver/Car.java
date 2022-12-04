package com.caranddriver;

/**
 * Car super class.
 * @author alanlytton
 */
public class Car {
    protected int gasLevel = 10;

    /**
     * method to display remaining gas level out of the 10 point maximum
     * @return String message to display the current gas level
     */
    public String displayGasLevel(){
        String message = String.format("Your remaining gas is %s/10",gasLevel);
        return message;
    }
}
