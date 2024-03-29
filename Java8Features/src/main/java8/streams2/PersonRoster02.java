package main.java8.streams2;

import java.util.List;

import main.java8.pojos.Person;
import main.java8.utils.PersonUtils;

/**
 * Pipelines and Streams: Aggregate Operations
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class PersonRoster02 {
	
	public static void main(String[] args) {
		List<Person> roster = PersonUtils.generateRandomPersonList(500);
		
        System.out.println("List of all MALE persons in the roster who are elligible for millitary service:");
        
        roster
        		.stream()
        		.filter(p -> p.getGender() == Person.Gender.MALE && p.getAge() >= 18 && p.getAge() < 25)
        		.sorted((p1, p2) -> p1.getBirthday().compareTo(p2.getBirthday()))
        		.forEach(p -> System.out.println(p));		
	}
	
}
