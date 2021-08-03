package day5Hw1.business.abstracts;

import day5Hw1.entities.concretes.Customer;

public interface CustomerService {
	void signUp(Customer customer);
	void signIn(Customer customer);	
}
