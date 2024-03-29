package main.java8.streams.parallel;

import java.util.Collection;
import java.util.OptionalDouble;

import main.java8.pojos.Employee;
import main.java8.utils.EmployeeUtils;
import main.java8.utils.Timer;

/**
 * Using Stream API to average over a collection of items
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class EmployeeApp1 {
	
	private static final int COLLECTION_SIZE = 1000000;

	public static void main(String[] args) {
		Collection<Employee> employeeCollection = 
				EmployeeUtils.generateEmployeeCollection(COLLECTION_SIZE);
		
		System.out.println("Calculating the average salary of employee collection...");
		
		Timer.start();
		
		OptionalDouble averageSalary = employeeCollection.stream().mapToDouble(e -> e.getSalary()).average();
		
		Timer.stop();
		Timer.print();
		
		System.out.printf("Average salary of %,d employees in the collection is $%,.2f", COLLECTION_SIZE, averageSalary.getAsDouble());
	}
}
