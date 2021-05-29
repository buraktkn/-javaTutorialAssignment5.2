package lecture5HW.core;

import lecture5HW.entities.concretes.User;

public interface AuthoreizedUserService {
	boolean authorized(User user);
}
