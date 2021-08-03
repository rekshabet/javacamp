package day5Hw1;
import day5Hw1.business.concretes.*;
import day5Hw1.dataAccess.concretes.HibernateCustomerDao;
import day5Hw1.entities.concretes.Customer;
 
public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Said", "Can", "mailadresim1@gmail.com","1456233");
		Customer customer2 = new Customer(2, "Can", "Kaya", "mailadresim2@gmail.com","1455333");
		Customer customer3 = new Customer(3, "Mehmet", "Cankaya", "mailadresim3@gmail.com","7894666");
		

		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager(),new MailVerificationManager(),new HibernateCustomerDao());
		
		customerManager.signUp(customer1);
		customerManager.signUp(customer2);
		customerManager.signUp(customer3);
	
		
	}

}
