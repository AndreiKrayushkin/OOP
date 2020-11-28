package by.andrei.task12.customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bank {
	private List<Customer> bank;
	
	public Bank() {
		bank = new ArrayList<Customer>();
	}
	
	public void add(Customer c) {
		bank.add(c);
	}
	
	public List<Customer> getBank(){
		return bank;
	}
	
	public List<Customer>searchByName (String name) {
		List<Customer> newListSearchByName = new ArrayList<Customer>();
		for (Customer customer : bank) {
			if (customer.getName().equalsIgnoreCase(name)) {
				newListSearchByName.add(customer);
			}
		}
		return newListSearchByName;
	}
	
	public List<Customer>searchByLastName (String lastName) {
		List<Customer> newListSearchByLastName = new ArrayList<Customer>();
		for (Customer customer : bank) {
			if (customer.getLastname().equalsIgnoreCase(lastName)) {
				newListSearchByLastName.add(customer);
			}
		}
		return newListSearchByLastName;
	}
	
	public List<Customer>searchByBankAccount (int bankAccount) {
		List<Customer> newListSearchByBankAccount = new ArrayList<Customer>();
		for (Customer customer : bank) {
			if (customer.getBankAccount() == bankAccount) {
				newListSearchByBankAccount.add(customer);
			}
		}
		return newListSearchByBankAccount;
	}
	
	public int sumForPositiveAll (String lastName, String name) {
		int sum = 0;
		for (Customer customer : bank) {
			if (customer.getMoney() > 0 && customer.getLastname().equalsIgnoreCase(lastName) && customer.getName().equalsIgnoreCase(name)) {
				sum += customer.getMoney();
			}
		}
		return sum;
	}
	public int sumForNegativeAll(String lastName, String name) {
		int sum = 0;
		for (Customer customer : bank) {
			if (customer.getMoney() < 0 && customer.getLastname().equalsIgnoreCase(lastName) && customer.getName().equalsIgnoreCase(name)) {
				sum += customer.getMoney();
			}
		}
		return sum;
	}
	public int sumTotal(String lastName, String name) {
		int sum = 0;
		for (Customer customer : bank) {
			if (customer.getLastname().equalsIgnoreCase(lastName) && customer.getName().equalsIgnoreCase(name)) {
				sum += customer.getMoney();
			}
		}
		return sum;
	}
	
	public List<Customer>sortMain (Bank bank2) {
		List <Customer> list = new ArrayList<Customer>(bank2.getBank());
		Collections.sort(list, new Comparator<Customer>() {
			public int compare (Customer o1, Customer o2) {
				return o1.getLastname().compareToIgnoreCase(o2.getLastname());
			}
		});
		return list;
	}

}
