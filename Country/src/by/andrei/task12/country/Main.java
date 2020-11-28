//Создать объект класса Государство, используя классы Область, Район, Город. 
//Методы: вывести на консоль столицу, количество областей, 
//площадь, областные центры.
package by.andrei.task12.country;

public class Main {

	public static void main(String[] args) {
		Country country = new Country("Belarus");
		
		City city1 = new City("Brest", true);
		City city2 = new City("Baranovichi");
		City city3 = new City("Vitebsk", true);
		City city4 = new City("Braslav");
		City city5 = new City("Gomel", true);
		City city6 = new City("Vetkovsk");
		City city7 = new City("Grodno", true);
		City city8 = new City("Voronov");
		City city9 = new City("Minsk", true, true);
		City city10 = new City("Vileisk");
		City city11 = new City("Mogilev", true);
		City city12 = new City("Bobruisk");
		
		District district1 = new District("Brestski");
		District district2 = new District("Baranovichski");
		District district3 = new District("Vitebski");
		District district4 = new District("Braslavski");
		District district5 = new District("Gomelski");
		District district6 = new District("Vetkovski");
		District district7 = new District("Grodnenski");
		District district8 = new District("Voronovski");
		District district9 = new District("Minski");
		District district10 = new District("Vileiski");
		District district11 = new District("Mogilevski");
		District district12 = new District("Bobruiski");
		district1.setCityAdd(city1);
		district2.setCityAdd(city2);
		district3.setCityAdd(city3);
		district4.setCityAdd(city4);
		district5.setCityAdd(city5);
		district6.setCityAdd(city6);
		district7.setCityAdd(city7);
		district8.setCityAdd(city8);
		district9.setCityAdd(city9);
		district10.setCityAdd(city10);
		district11.setCityAdd(city11);
		district12.setCityAdd(city12);
		
		Region region1 = new Region("Brestskaya", 32.786);
		Region region2 = new Region("Vitebskaya", 40.051);
		Region region3 = new Region("Gomelskaya", 40.372);
		Region region4 = new Region("Grodnenskaya", 25.127);
		Region region5 = new Region("Minskaya", 40.202);
		Region region6 = new Region("Mogilevskaya", 29.068);
		region1.setDistrictAdd(district1);
		region1.setDistrictAdd(district2);
		region2.setDistrictAdd(district3);
		region2.setDistrictAdd(district4);
		region3.setDistrictAdd(district5);
		region3.setDistrictAdd(district6);
		region4.setDistrictAdd(district7);
		region4.setDistrictAdd(district8);
		region5.setDistrictAdd(district9);
		region5.setDistrictAdd(district10);
		region6.setDistrictAdd(district11);
		region6.setDistrictAdd(district12);
		
		country.setRegionAdd(region1);
		country.setRegionAdd(region2);
		country.setRegionAdd(region3);
		country.setRegionAdd(region4);
		country.setRegionAdd(region5);
		country.setRegionAdd(region6);
		
		View view = new View();
		Logic logic = new Logic();
		
		logic.searchCapitalCountry(country);
		System.out.println(logic.searchCapitalCountry(country));
		System.out.println(logic.numberRegion(country));
		System.out.println(logic.sumSquare(country));
		view.getRegionCapitalCity(country);
		//view.getSquare(country);
		//view.getAll(country);
		
	}
	
}
