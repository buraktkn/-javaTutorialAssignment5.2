package lecture5HW.core;

import java.util.List;

import lecture5HW.dataAccess.abstracts.UserDao;
import lecture5HW.entities.concretes.User;

public class ValidationManager {
	public boolean valid(User user, List<String> emails, UserDao userDao) {
		if(user.getFirstName().isEmpty() || user.getLastName().isEmpty() || 
				user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			System.out.println("Registration failed. Please fill in the required fields.");
			return false;
		}
		
		if(user.getPassword().length() < 6) {
			System.out.println("Registration failed. The password must be at least 6 characters.");
			return false;
		}
		
		RegexManager regexManager = new RegexManager();
		if(!regexManager.checkEmailFormat(user.getEmail())) {
			System.out.println("Registration failed. The e-mail format is not suitable.");
			return false;
		}
		
		if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Registration failed. Name and Surname must have at least 2 characters.");
			return false;
		}
		if(userDao.checkEmail(user)) {
			System.out.println("Registration failed. The e-mail address is already registered in the system.");
			return false;
		}
		return true;
		
	}
}