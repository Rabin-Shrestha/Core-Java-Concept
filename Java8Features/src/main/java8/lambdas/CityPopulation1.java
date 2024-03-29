package main.java8.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import main.java8.pojos.City;
import main.java8.utils.TopCities;

/**
 * Uses a Comparator implementation (static nested class) to sort the list of cities.
 * 
 * @author Shrestha, Rabin
 * @since 1.0
 *
 */
public class CityPopulation1 {

	public static void main(String[] args) {
		List<City> topCities = TopCities.getTopCities();
		
		Comparator<City> cityComparator = Collections.reverseOrder(new CityPopulationComparator());
		
		Collections.sort(topCities, cityComparator);
		
		TopCities.printCities(topCities);
	}
	
	private static class CityPopulationComparator implements Comparator<City> {

		@Override
		public int compare(City c1, City c2) {
			// Natural order of population, from low to high
			return c1.getPopulation() - c2.getPopulation();
		}

	}
	
}
