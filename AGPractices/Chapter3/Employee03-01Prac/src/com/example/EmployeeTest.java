package com.example;

import com.example.domain.*;

public class EmployeeTest {

    public static void main(String[] args) {
        Engineer eng = new Engineer(1, "Jane Smith", "012-34-5678", 120_345.27);
        Manager mgr = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Admin adm = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00); 
        
        eng.printEmployee();
        mgr.printEmployee();
        adm.printEmployee();
        dir.printEmployee();
        
        mgr.setName("Batman Pointyears");
        mgr.raiseSalary(10_000.00);
        mgr.printEmployee();
        
        
    }
}