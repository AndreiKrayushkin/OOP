package by.andrei.task12.customer;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.add(new Customer(2551, "Andrei", "Krayushkin", 600));
		bank.add(new Customer(2552, "Andrei", "Krayushkin", 1123));
		bank.add(new Customer(2550, "Dmitry", "Skibnevski", 200));
		bank.add(new Customer(2410, "Artem", "Bibulatov", 340));
		bank.add(new Customer(3401, "Nastasia", "Nasivich", 700));
		bank.add(new Customer(1254, "Maksim", "Latishev", -340));
		bank.add(new Customer(1254, "Maksim", "Latishev", -40));
		bank.add(new Customer(1254, "Maksim", "Latishev", 220));
		bank.add(new Customer(2201, "Dasha", "Shved", -1500));
		
		View view = new View();
		view.print(bank.getBank());
		System.out.println("");
		view.print(bank.searchByName("Artem"));
		System.out.println("");
		view.printInt(bank.sumForPositiveAll("Krayushkin", "Andrei"));
		System.out.println("");
		view.printInt(bank.sumForNegativeAll("Latishev", "Maksim"));
		System.out.println("");
		view.printInt(bank.sumTotal("Latishev", "maksim"));
		System.out.println("-------");
		view.print(bank.sortMain(bank));
	}

}
