package lecture5HW.business.concretes;


import java.util.ArrayList;
import java.util.List;

import lecture5HW.business.abstracts.UserService;
import lecture5HW.business.abstracts.VerificationService;
import lecture5HW.core.ValidationManager;
import lecture5HW.dataAccess.abstracts.UserDao;
import lecture5HW.entities.concretes.User;
public class UserManager implements UserService{

	@Override
	public void save(User user) {
		if(validation.valid(user, emails, userDao)) {
			verify.sendMail(user);
		}
		
	}

	@Override
	public void verify(User user) {
		verify.verify(user);
		userDao.add(user);
		
	}
	
	private List<String> emails = new ArrayList<String>();
	ValidationManager validation;
	VerificationService verify;
	UserDao userDao;
	
	public UserManager(ValidationManager validation, VerificationService verify,UserDao userDao) {
		super();
		this.validation = validation;
		this.verify = verify;
		this.userDao = userDao;
	}
	
	

}
