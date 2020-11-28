package by.andrei.task12.country;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Logic {
	public City searchCapitalCountry (Country c) {
		for (Region region : c.getRegionAdd()) {
			for (District district : region.getDistrictAdd()) {
				for (City city : district.getCityAdd()) {
					if (city.isCapitalCountry() == true) {
						return city;
					}
				}
			}
		}
		return null;
	}
	
	public int numberRegion (Country c) {
		int counter = 0;
		for (Region region : c.getRegionAdd()) {
			counter++;
		}
		return counter;
	}
	
	public String sumSquare (Country c) {
		double sum = 0;
		for (Region region : c.getRegionAdd()) {
			sum += region.getSquare();
		}
		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);
		return df.format(sum);
	}
	
	public List<City> getRegionalCapitalCity (Country c) {
		List<City> regionalCapitalCity = new ArrayList<City>();
		for (Region region : c.getRegionAdd()) {
			for (District district : region.getDistrictAdd()) {
				for (City city : district.getCityAdd()) {
					if (city.isCapitalRegion()) {
						regionalCapitalCity.add(city);
					}
				}
			}
		}
		return regionalCapitalCity;
	}
	
}
