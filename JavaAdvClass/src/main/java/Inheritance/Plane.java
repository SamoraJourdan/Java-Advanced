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
public class Plane extends Vehicle {
    double airSpeed;
    int maxPassengers;
    String planeType;
    
    public Plane(String terrain, String licence, double weight, double airSpeed, int maxPassengers, String planeType){
        super(terrain, licence, weight);
        this.airSpeed = airSpeed;
        this.maxPassengers = maxPassengers;
        this.planeType = planeType;
        
    }
    
    @Override
    public void Display(){
        super.Display();
        System.out.println("Air Speed: " + this.getAirSpeed() + " Km/h");
        System.out.println("Maximum Passengers: " + this.getMaxPassengers());
        System.out.println("Plane Type: " + this.getPlaneType() + "\n");
    }

    public double getAirSpeed() {
        return airSpeed;
    }

    public void setAirSpeed(double airSpeed) {
        this.airSpeed = airSpeed;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }
    
    
}
