/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author pc
 */
public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.setState(PowerState.SUSPEND);
        System.out.println("State: " + comp.getState());
        System.out.println("Desc: " + comp.getState().getDiscription());
    }
}
