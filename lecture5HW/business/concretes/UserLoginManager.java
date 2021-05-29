package lecture5HW.business.concretes;

import lecture5HW.business.abstracts.UserLoginService;
import lecture5HW.dataAccess.abstracts.UserDao;
import lecture5HW.entities.concretes.User;

public class UserLoginManager implements UserLoginService{
	
	UserDao userdao;
	
	public public UserLoginManager(UserDao userdao) {
		this.userdao=userdao;
	}
	
	@Override
	public void login(User user) {
		for (User user1 : userdao.getAll()) {
			if(user.getEmail() == user1.getEmail() && user.getPassword() == user1.getPassword()) {
				System.out.println("Successful login");
				return;
			}
			System.out.println("Fail login.");
			return;
			
		}
		
	}

}
