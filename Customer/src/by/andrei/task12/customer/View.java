package by.andrei.task12.customer;

import java.util.List;

public class View {
	public void print (List<Customer> list) {
		for(Customer bank : list) {
			System.out.println(bank.getBankAccount() + " "  +  bank.getState() + " "
					+ bank.getName() + " " + bank.getLastname() 
					+ " " + bank.getMoney());
		}
	}
	
	public void printInt (int i) {
		System.out.println(i);
	}
}
