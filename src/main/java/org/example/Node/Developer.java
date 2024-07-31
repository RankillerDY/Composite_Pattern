package org.example.Node;

import java.util.ArrayList;

public class Developer extends Employee{
    private ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public Developer(String name, double age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void add(Employee employee) {
        employeeArrayList.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeArrayList.remove(employee);
    }

    @Override
    public void print() {
        System.out.println("==============");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);

        for (Employee employee : employeeArrayList) {
            employee.print();
        }

    }
}
