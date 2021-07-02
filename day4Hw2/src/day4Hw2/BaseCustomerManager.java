package day4Hw2;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanına eklendi : "+customer.getFirstName()+" "+customer.getLastName());
	}

}
