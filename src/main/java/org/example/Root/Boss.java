package org.example.Root;

import org.example.Node.Employee;

import java.util.ArrayList;

public class Boss extends Employee {
    private ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public Boss(String name, double age, double salary) {
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
