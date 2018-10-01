package September28thAss2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a186520
 */
public abstract class Employee implements IEmployee {

    private String name;
    private int employeeType;
    private int salary;
    private int age;
    private boolean active = false;

    public Employee(String name, int employeeType, int salary, int age) {
        this.name = name;
        this.employeeType = employeeType;
        this.salary = salary;
        this.age = age;
    }

    public void displayEmployee() {
        System.out.println(name + "," + employeeType + ", " + salary + "," + age + "," + active);
    }

    public void activateEmployee() {
//        this.displayEmployee();
        active = true;
    }

    public void deactivateEmployee() {
//        this.displayEmployee();
        active = false;
    }

    public void setSalary(int amount) {
        if (amount < 10000) {
            try {
                throw new Exception();
            } catch (Exception ex) {
                System.out.println("salary too low");
            }
        }
        else if (amount > 100000) {
            try {
                throw new Exception();
            } catch (Exception ex) {
                System.out.println("salary too high");;
            }
        }
        else if (this.employeeType == MANAGER && salary < 20000) {
            try {
                throw new Exception();
            } catch (Exception ex) {
                System.out.println("salary not enough");
            }
        }
        else if (this.employeeType == DEVELOPER && salary > 30000) {
            try {
                throw new Exception();
            } catch (Exception ex) {
                System.out.println("salary out of range");
            }
        }
        else if (this.employeeType == EXEC && salary < 50000) {
            try {
                throw new Exception();
            } catch (Exception ex) {
                System.out.println("salary not in range");
            }
        }
        this.salary = amount;
    }
    @Override
    public String toString(){
	return ("name: " + name + "," + "Employee Type: " + employeeType + ", " + "Salary: " + salary + "," +  "Age: " + age + "," +  "Active: " + active);
    }


    public boolean equals(Employee emp) {
        if (name.equals(emp.name) && age == emp.age && employeeType == emp.employeeType && salary == emp.salary){
        return true;
    }
        return false;
    }
}
