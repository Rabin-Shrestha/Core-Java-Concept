package main.java8.streams.parallel;

import java.util.Collection;

import main.java8.pojos.Employee;
import main.java8.utils.EmployeeUtils;

/**
 * Using Stream API to average over a collection of items
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class EmployeeApp5 {
	
	private static final int COLLECTION_SIZE = 100000;

	public static void main(String[] args) {
		Collection<Employee> employeeCollection = 
				EmployeeUtils.generateEmployeeCollection(COLLECTION_SIZE);
		
		System.out.println("Calculating the average salary of employee collection...");
		
		Employee e1 = employeeCollection.stream().sequential().findAny().get();
		Employee e2 = employeeCollection.stream().parallel().findAny().get();
		Employee e3 = employeeCollection.stream().sequential().findAny().get();
		
		System.out.printf("%nWill the result of findAny() be the same for parallel and sequential streams?? %b", e1 == e2);
		System.out.printf("%nWill the result of findAny() be the same for sequential and sequential streams?? %b", e1 == e3);
	}
	
}
