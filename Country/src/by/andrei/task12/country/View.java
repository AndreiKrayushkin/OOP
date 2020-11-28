package by.andrei.task12.country;

public class View {
	Logic l = new Logic();
	public void getCapitalCountry (Country c) {
		System.out.println(c.getName());
	}
	
	public void getRegionCapitalCity (Country c) {
		System.out.println(l.getRegionalCapitalCity(c));
	}
}
	
