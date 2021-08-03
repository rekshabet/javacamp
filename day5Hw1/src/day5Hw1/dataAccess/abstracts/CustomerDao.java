package day5Hw1.dataAccess.abstracts;

import java.util.List;
import day5Hw1.entities.concretes.Customer;
public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	boolean getEmail(String email);
	boolean getPassword(String email);
	List<Customer> getAll();
}
