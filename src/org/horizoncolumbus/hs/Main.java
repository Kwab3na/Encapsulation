package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
        Employee farah = new Employee(1_000_000);
        // System.out.println(farah.salary); (Not Possible)
        System.out.println(farah.getSalary());
        farah.setSalary(farah.getSalary() + ((farah.getSalary() * 10 / 100)));
        System.out.println("$" + farah.getSalary());
    }
}
