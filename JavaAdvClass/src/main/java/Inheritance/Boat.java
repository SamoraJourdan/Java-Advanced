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
public class Boat extends Vehicle{
    double waterSpeed;
    String cargo;
    
    public Boat(String terrain, String licence, double weight, double waterSpeed, String cargo){
        super(terrain, licence, weight);
        this.waterSpeed = waterSpeed;
        this.cargo = cargo;
    }
    public void Display(){
        super.Display();
        System.out.println("Water Speed: " + this.getWaterSpeed() + " Km/h");
        System.out.println("Cargo " + this.getCargo() + "\n");
        
    }

    public double getWaterSpeed() {
        return waterSpeed;
    }

    public void setWaterSpeed(double waterSpeed) {
        this.waterSpeed = waterSpeed;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
