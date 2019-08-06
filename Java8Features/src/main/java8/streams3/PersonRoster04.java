package main.java8.streams3;

import java.util.List;

import main.java8.pojos.Person;
import main.java8.utils.PersonUtils;

/**
 * Pipelines and Streams: Reduction average() is a reduction operation
 * 
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class PersonRoster04 {

	public static void main(String[] args) {
		List<Person> roster = PersonUtils.generateRandomPersonList(100000);

		double averageAge = roster
				.stream()
				.filter(p -> p.getGender() == Person.Gender.MALE)
				.mapToInt(Person::getAge)
				.average()
				.getAsDouble();

		System.out.printf("Average age of all MALE persons in the roster: %.2f", averageAge);
	}

}
