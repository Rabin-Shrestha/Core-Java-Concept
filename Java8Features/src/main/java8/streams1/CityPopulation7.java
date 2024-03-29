package main.java8.streams1;

import java.util.List;
import java.util.OptionalDouble;

import main.java8.pojos.City;
import main.java8.utils.TopCities;

/**
 * Uses Stream API to calculate the average population of top 50 US cities.
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class CityPopulation7 {

	public static void main(String[] args) {
		List<City> topCities = TopCities.getTopCities();
		
		OptionalDouble averagePopulation = topCities
				.stream()
				.peek(System.out::println)
				.mapToInt(c -> c.getPopulation())
				.average();
		
		System.out.printf("\nAverage population of top 50 US cities is %,.0f", averagePopulation.getAsDouble());
		
		OptionalDouble averagePopulationChange = topCities
				.stream()
				.mapToDouble(c -> c.getPopulationChange())
				.average();
		
		System.out.printf("\nAverage population change in top 50 US cities is %.2f percent", averagePopulationChange.getAsDouble());
	}
}
