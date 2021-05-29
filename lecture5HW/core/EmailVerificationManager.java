package lecture5HW.core;

import lecture5HW.business.abstracts.VerificationService;
import lecture5HW.entities.concretes.User;

public class EmailVerificationManager implements VerificationService{

	@Override
	public void sendMail(User user) {
		System.out.println("Verification message send to E-mail " + user.getEmail());
		
	}

	@Override
	public void verify(User user) {
		System.out.println("The account verified.");
		
	}

}
