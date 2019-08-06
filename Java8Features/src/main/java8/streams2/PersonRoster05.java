package main.java8.streams2;

import java.util.List;

import main.java8.pojos.Person;
import main.java8.utils.PersonUtils;
import main.java8.utils.Timer;

/**
 * Pipelines and Streams: Reduction average() is a reduction operation
 * 
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class PersonRoster05 {

	public static void main(String[] args) {
		List<Person> roster = PersonUtils.generateRandomPersonList(100000);

		long count = 0;
		Timer.start();
		for (int i = 0; i < 100; ++i) {
			count = roster
					.stream()
					.filter(p -> p.getGender() == Person.Gender.MALE && p.getAge() < 25)
					.count();
		}
		Timer.stop();
		System.out.printf("Took %d milliseconds to count %d persons\n", Timer.getDuration(), count);

		Timer.start();
		for (int i = 0; i < 100; ++i) {
			count = roster
					.stream()
					.filter(p -> p.getGender() == Person.Gender.MALE)
					.filter(p -> p.getAge() < 25)
					.count();
		}
		Timer.stop();
		System.out.printf("Took %d milliseconds to count %d persons\n", Timer.getDuration(), count);
	}

}
