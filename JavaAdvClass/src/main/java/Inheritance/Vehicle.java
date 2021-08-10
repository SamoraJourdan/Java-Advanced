/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.awt.BorderLayout;

/**
 *
 * @author pc
 */
public class Vehicle {
   String terrain;
   double weight;
   String licence;
   
   public Vehicle(String terrain, String licence, double weight){
       this.terrain = terrain;
       this.licence = licence;
       this.weight = weight;
       
   }
   
   public void Display(){
       System.out.println("Terrain: " + this.getTerrain());
       System.out.println("Licence Num: " + this.getLicence());
       System.out.println("Weight: " + this.getWeight() + " Kg");
   }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
}
