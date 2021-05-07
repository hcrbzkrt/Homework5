package business.abstracts;

import entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(User user);
	void delete(User user);
	void passwordChange(User user);
	User getMyEmail(String mail);
}
