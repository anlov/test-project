package com.anlov.Lesson_4;

public class Employee {
    private String fullname;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;
    public Employee() {
        fullname= "Ivanov Ivan Ivanovich";
        position = "senior";
        email = "ivan@gmai.com";
        phoneNumber = "+375 75 292 23 47";
        salary = 1234;
        age = 54;
    }
    public Employee(String fullname, String position, String email,String phoneNumber,
                    double salary,int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void displayInfo() {
        System.out.printf("Fullname %s \tPosition: %s \tEmail: %s \tPhone: %s" +
                "\tSalary: %.2f \tAge: %d\n",fullname,position,email,phoneNumber,salary,age);
    }
}
