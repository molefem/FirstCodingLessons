package September28thAss2;

import static September28thAss2.IEmployee.EXEC;
import static September28thAss2.IEmployee.MANAGER;
import static September28thAss2.IEmployee.DEVELOPER;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a186520
 */
public class EnrollEmployee {

    public static void main(String[] args) {
        BankEmployee bob;
        BankEmployee jerry;
        BankEmployee tom;

        bob = new BankEmployee("Bob", MANAGER, 30000, 30);
        jerry = new BankEmployee("Jerry", DEVELOPER, 20000, 30);
        tom = new BankEmployee("Tom", EXEC, 50000, 30);
        
        bob.activateEmployee();
        jerry.activateEmployee();
        tom.activateEmployee();

        bob.displayEmployee();
        jerry.displayEmployee();
        tom.displayEmployee();
        
        bob.deactivateEmployee();

        BankEmployee newOne = bob;
        System.out.println(newOne.equals(bob));

        newOne.setSalary(10000);
        tom.setSalary(40000);
        jerry.setSalary(50000);
        jerry.setSalary(1000);
        tom.setSalary(200000);

        System.out.println(bob);
        System.out.println(jerry);
        System.out.println(tom);
        System.out.println(newOne);

    }
}
