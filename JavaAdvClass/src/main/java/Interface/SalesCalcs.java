/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author pc
 */
public interface SalesCalcs {
  public String getName();
  public double calcSalesPrice();
  public double calcCost();
  public double calcProfit();
  public default void printItemData(SalesCalcs item){
    System.out.println("--" + item.getName() + " Report--");
    System.out.println("Sales Price: " + item.calcSalesPrice());
    System.out.println("Cost: " + item.calcCost());
    System.out.println("Profit: " + item.calcProfit());
  }
}