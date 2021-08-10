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
public class Main {
    public static void main(String[] args) {
       Plane planeOne = new Plane("Air", "DWALSC5697", 10000, 6000, 200, "Passenger Airliner (Boeing747)" );
       planeOne.setAirSpeed(7000);
       planeOne.Display();
       Car carOne = new Car("Land", "PFH234 GP", 2000, 200, "City Golf", "Class B");
       carOne.setLicence("PDH 497 NW");
       carOne.Display();
       Boat boatOne = new Boat("Sea", "BEJWJ3242", 20000, 500, "Produce");
       boatOne.setTerrain("River/Sea");
       boatOne.Display();
    }
    
}
