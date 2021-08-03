package day5Hw1.dataAccess.concretes;
import java.util.*;
import day5Hw1.dataAccess.abstracts.CustomerDao;
import day5Hw1.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{
	List<Customer> customers = new ArrayList<Customer>();

	@Override
	public void add(Customer customer) {
		customers.add(customer);
	}

	@Override
	public void update(Customer customer) {
		
	}

	@Override
	public void delete(Customer customer) {
		
	}

	@Override
	public List<Customer> getAll() {
		return null;
	}

	@Override
	public boolean getEmail(String email) {
		for (Customer customer : customers) {
			if(customer.getEmail() == email) {
				return true;
			}
		}
		return false;		
	}

	@Override
	public boolean getPassword(String password) {
		for(Customer customer : customers) {
			if(customer.getPassword() == password)
			{
				return true;
			}
		}
		return false;
		
	}

}
