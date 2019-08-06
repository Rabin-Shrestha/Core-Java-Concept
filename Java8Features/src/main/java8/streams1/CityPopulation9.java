package main.java8.streams1;

import java.util.List;

import main.java8.pojos.City;
import main.java8.utils.TopCities;

/**
 * Uses Stream API to calculate the total population of top 50 US cities.
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class CityPopulation9 {

	public static void main(String[] args) {
		List<City> topCities = TopCities.getTopCities();
		
		Integer totalPopulation = topCities
				.stream()
				.mapToInt(c -> c.getPopulation())
				.reduce(0, Integer::sum);
		
		System.out.printf("\nTotal population of top 50 US cities is %,d", totalPopulation);
		
	}
}
