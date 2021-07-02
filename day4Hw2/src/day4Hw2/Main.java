package day4Hw2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Sait", "Çankaya", LocalDate.of(1999, 12, 5), "12345678912");
		BaseCustomerManager customerNero=new NeroCustomerManager();
		customerNero.save(customer);
		
		BaseCustomerManager customerStarbuck=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerStarbuck.save(customer);
	}

}
