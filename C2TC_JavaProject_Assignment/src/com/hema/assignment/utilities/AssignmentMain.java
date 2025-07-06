package com.hema.assignment.utilities;

// imported the outside package employye to perform object in it
import com.hema.assignment.employees.*;
public class AssignmentMain {
// main class
	public static void main(String[] args) {
		Manager manager = new Manager("Grace", 101, 90000, 5);
        Developer developer = new Developer("Benita", 102, 75000, "Java");

        EmployeeUtilities.displayEmployeeInfo(manager);
        EmployeeUtilities.displayEmployeeInfo(developer);

        EmployeeUtilities.increaseSalary(manager, 5000);
        EmployeeUtilities.increaseSalary(developer, 3000);

        EmployeeUtilities.displayEmployeeInfo(manager);
        EmployeeUtilities.displayEmployeeInfo(developer);
    }
}