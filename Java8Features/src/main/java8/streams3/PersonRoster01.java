package main.java8.streams3;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import main.java8.pojos.Employee;
import main.java8.pojos.Person;
import main.java8.utils.PersonUtils;

/**
 * Pipelines and Streams: Aggregate Operations
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class PersonRoster01 {

	public static void main(String[] args) {
		List<Person> roster = PersonUtils.generateRandomPersonList(100);
		
		Employee e = new Employee(null, null);
		roster.add(e);

		Function<Person, Person.Gender> function =
				p -> {
					if(p.getGender() == Person.Gender.MALE) {
						return Person.Gender.MALE;
					}
					else {
						return null;
					}
				};
		System.out.println("List of genders in the roster:" + mapList(roster, function));

	}
	
	public static List<Person.Gender> mapList(List<Person> list, Function<Person, Person.Gender> function) {
		return list.stream().map(function).collect(Collectors.toList());
	}


}
