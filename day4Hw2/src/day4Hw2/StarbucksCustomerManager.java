package day4Hw2;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealCustomer(customer)) {
			System.out.println("save customer");
		} 
		else {
			System.out.println("Not a valid customer");
		}
	}

}
