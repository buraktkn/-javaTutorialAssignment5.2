package lecture5HW.dataAccess.abstracts;

import java.util.List;

import lecture5HW.entities.concretes.User;

public interface UserDao {
	void add(User user);
	boolean checkEmail(User user);
	List<User> getAll();

}
