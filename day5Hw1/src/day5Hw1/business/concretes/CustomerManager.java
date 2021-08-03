package day5Hw1.business.concretes;

import day5Hw1.business.abstracts.*;
import day5Hw1.dataAccess.abstracts.CustomerDao;
import day5Hw1.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	CustomerCheckService customerCheckService;
	VerificationService mailVerificationService;
	CustomerDao customerDao;

	public CustomerManager(
			CustomerCheckService customerCheckService, 
			VerificationService mailVerificationService,
			CustomerDao customerDao) {
		this.customerCheckService = customerCheckService;
		this.mailVerificationService = mailVerificationService;
		this.customerDao = customerDao;
	}

	@Override
	public void signUp(Customer customer) {
		if (customerCheckService.isValid(customer) == true) {
			System.out.print(customer.getFirstName() + " kullan�c�s� ba�ar�yla sisteme eklendi.\n");
			mailVerificationService.sendMail(customer.getEmail());
			customerDao.add(customer);
		}

	}

	@Override
	public void signIn(Customer customer) {

		mailVerificationService.verifyMail(customer.getEmail());

		if (customerDao.getEmail(customer.getEmail()) && customerDao.getPassword(customer.getPassword())
				&& mailVerificationService.isVerificated(customer.getEmail()) == true) {
			System.out.println("Kullan�c� giri�i ba�ar�yla yap�ld�.");
		} else if (mailVerificationService.isVerificated(customer.getEmail()) == false) {
			System.out.println("Kullan�c� bilgileri do�ru. Fakat mail adresi do�rulanmad��� i�in giri� yap�lam�yor.");
		} else {
			System.out.println("Kullan�c� bilgileri yanl��, l�tfen kontrol ediniz.");
		}
	}

}
