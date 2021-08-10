/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author pc
 */
public class Car extends Vehicle {
    double landSpeed;
    String make;
    String carType;
    
    public Car(String terrain, String licence, double weight, double landSpeed, String make, String carType){
        super(terrain, licence, weight);
        this.landSpeed = landSpeed;
        this.make = make;
        this.carType = carType;
    }
    
    @Override
    public void Display(){
        super.Display();
        System.out.println("Land Speed: " + this.getLandSpeed() + " Km/h");
        System.out.println("Make: " + this.getMake());
        System.out.println("Car Type: " + this.getCarType() + "\n");
    }

    public double getLandSpeed() {
        return landSpeed;
    }

    public void setLandSpeed(double landSpeed) {
        this.landSpeed = landSpeed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
    
    
}
