package org.horizoncolumbus.hs;

public class Employee {
    private int salary;

    Employee(int s){
        salary = s;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int s){
        salary = s;
    }
}
