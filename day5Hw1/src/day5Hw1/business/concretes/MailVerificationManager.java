package day5Hw1.business.concretes;

import java.util.*;

import day5Hw1.business.abstracts.VerificationService;

public class MailVerificationManager implements VerificationService {

	CustomerCheckManager customerCheckManager;

	List<String> verificatedEmails = new ArrayList<String>();

	@Override
	public void verifyMail(String email) {
		verificatedEmails.add(email);
	}

	@Override
	public void sendMail(String email) {
		System.out.println(email + " kullanıcısına doğrulama mail'i gönderildi.");
	}

	@Override
	public boolean isVerificated(String email) {
		if (verificatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

}
