package day4Hw2;
import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		
		KPSPublicSoap client =new KPSPublicSoapProxy();
		
		boolean result=true;
		try {
			result=client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
