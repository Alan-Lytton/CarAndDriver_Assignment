package com.caranddriver;

/**
 * Driver subclass of Car. Allows for driving actions to be performed.
 * @author alanlytton
 */
public class Driver extends Car {
    /**
     * Method to go for a drive and consume 1 point of gas.
     * @return The active driver
     */
    public Driver drive(){
        System.out.println("You went for a drive");
        this.gasLevel -= 1;
        System.out.println(this.displayGasLevel());
        return this;
    }

    /**
     * Method to engage booster and consume 3 points of gas
     * @return The active driver
     */
    public Driver boost(){
        if (this.gasLevel < 3){
            System.out.println("Your fuel is to low to boost, please refuel");
        }
        else{
            System.out.println("You engaged the booster!");
            this.gasLevel -= 3;
            System.out.println(this.displayGasLevel());
        }
        return this;
    }

    /**
     * Method to refill car with some gas and increase gas level by 2 points
     * @return The active driver
     */
    public Driver refuel(){
        if(this.gasLevel > 8){
            System.out.println("Refilling now will overflow your tank. Use some gas before attempting to refill again.");
        }
        else{
            System.out.println("You refilled your car some");
            this.gasLevel += 2;
            System.out.println(this.displayGasLevel());
        }
        return this;
    }
}
