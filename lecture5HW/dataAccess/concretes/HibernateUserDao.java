package lecture5HW.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import lecture5HW.dataAccess.abstracts.UserDao;
import lecture5HW.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	private List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Added user " + user.getFirstName() + user.getLastName());
		
	}

	@Override
	public boolean checkEmail(User user) {
		for(User i : users) {
			if(i.getEmail() == user.getEmail()) {
					return true;
			}
		}
		return false;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}
	
}
