package lecture5HW.business.abstracts;

import lecture5HW.entities.concretes.User;

public interface VerificationService {
	void sendMail(User user);
	void verify(User user);
	

}
