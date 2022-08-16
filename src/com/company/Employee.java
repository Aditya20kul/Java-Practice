package com.company;

public class Employee {
    String name;
    int age;
    double salary;
    float yoe;
    static int totalHeadCount;
    public Employee(String name, int age, double salary, float yoe) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.yoe = yoe;
        this.totalHeadCount += 1;
    }


}
