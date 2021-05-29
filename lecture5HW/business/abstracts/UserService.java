package lecture5HW.business.abstracts;

import lecture5HW.entities.concretes.User;

public interface UserService {
	void save(User user);
	void verify(User user);
	
}
