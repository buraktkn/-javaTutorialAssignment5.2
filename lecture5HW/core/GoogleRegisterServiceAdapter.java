package lecture5HW.core;

import lecture5HW.dataAccess.abstracts.UserDao;
import lecture5HW.entities.concretes.User;
import lecture5HW.googleRegisterService.GoogleRegisterManager;

public class GoogleRegisterServiceAdapter implements AuthoreizedUserService{
	ValidationManager validation;
	UserDao userDao;
	
	public GoogleRegisterServiceAdapter() {
		
	}
	
	public GoogleRegisterServiceAdapter() {
		this.validation = validation;
		this.userDao = userDao;
		
	}

	public boolean authorized(User user) {
		GoogleRegisterManager register = new GoogleRegisterManager();
		
		if(register.register(user)) {
			return true;
		}
		return false;
	}

}
