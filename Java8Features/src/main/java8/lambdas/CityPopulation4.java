package main.java8.lambdas;

import java.util.Collections;
import java.util.List;

import main.java8.pojos.City;
import main.java8.utils.TopCities;

/**
 * Uses a lambda expression + utility method call to sort the list of cities.
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class CityPopulation4 {

	public static void main(String[] args) {
		List<City> topCities = TopCities.getTopCities();
		
		Collections.sort(topCities, (c1, c2) -> TopCities.comparePopulationHigh2Low(c1, c2));
		
		TopCities.printCities(topCities);
	}
}
