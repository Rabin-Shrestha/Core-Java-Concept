package main.java8.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import main.java8.pojos.City;
import main.java8.utils.TopCities;

/**
 * Uses a Comparator implementation (anonymous inner class) to sort the list of cities.
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class CityPopulation2 {

	public static void main(String[] args) {
		List<City> topCities = TopCities.getTopCities();
		
		Collections.sort(topCities, 
				new Comparator<City>() {
					public int compare(City c1, City c2) {
						// Reverse of natural order, from high to low
						return c2.getPopulation() - c1.getPopulation();
					}
				}
		);
		
		TopCities.printCities(topCities);
	}
}
