package day5Hw1.google;

import day5Hw1.core.GoogleService;

public class LoginGoogleManager implements GoogleService{


	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email + " kullan�c�sna do�rulama mail'i g�nderildi.");
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		System.out.println(email + " kullan�c�s�n�n hesab� do�ruland�.");
		return true;
	}

	
}
