package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
        Employee emp1 = new Employee("Emp1", 23, 1000000, 1);
        Employee emp2 = new Employee("Emp2", 25, 1500000, 3);
        System.out.println(emp1.totalHeadCount);
    }
}
