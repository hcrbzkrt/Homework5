package business.concretes;


import business.abstracts.UserService;
import core.AuthService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import googleAuth.GoogleAuthManager;

public class UserManager implements UserService {

	private UserDao userDao;
	private AuthService authService;
	
	public UserManager(AuthService authService) {
		this.authService = authService;
	}

	
	public void register(User user) {
		if(! GoogleAuthManager.googleManager(user)) {
			System.out.println("�ifre alt� karakterden uzun olmal�d�r! ");
		}
		if (GoogleAuthManager.googleManager(user)) {
			System.out.println("Bu kullan�c� ad� zaten var ! ");
		}
		else {
			System.out.println("Ba�ar�yla kay�t oldunuz. ");
			
		}
	}
	
	
	public void login(User user) {
		if(! GoogleAuthManager.googleManager(user)) {
			System.out.println("�ifre yanl�� ! ");
		}
		else {
			System.out.println("Ba�ar�yla giri� yapt�n�z. ");
			
		}
	}
	
	public void passwordChange(User user) {
		if(! GoogleAuthManager.googleManager(user)) {
			System.out.println("�ifre alt� karakterden uzun olmal�d�r! ");
		}
		if (GoogleAuthManager.googleManager(user)) {
			System.out.println("�ifre zaten var ! ");
		}
		else {
			System.out.println("�ifreniz de�i�mi�tir. ");
			
		}
	}


	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}


	@Override
	public User getMyEmail(String mail) {
		userDao.getByMail(mail);
		return null;
	}
	
	
	
}

