package main.java8.streams.parallel;

import java.util.Collection;

import main.java8.pojos.Employee;
import main.java8.utils.EmployeeUtils;
import main.java8.utils.Timer;

/**
 * Calculating average salary of a large collection of employees.
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class EmployeeApp0 {
	
	private static final int COLLECTION_SIZE = 1000000;

	public static void main(String[] args) {
		Collection<Employee> employeeCollection = 
				EmployeeUtils.generateEmployeeCollection(COLLECTION_SIZE);
		
		System.out.println("Calculating the average salary of employee collection...");
		
		Timer.start();
		
		Double sum = 0.0;
		for(Employee e : employeeCollection) {
			sum += e.getSalary();
		}
		Double averageSalary = sum/employeeCollection.size();

		Timer.stop();
		Timer.print();
		
		System.out.printf("Average salary of %,d employees in the collection is $%,.2f", COLLECTION_SIZE, averageSalary);
	}

}
