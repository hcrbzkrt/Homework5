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
			System.out.println("Þifre altý karakterden uzun olmalýdýr! ");
		}
		if (GoogleAuthManager.googleManager(user)) {
			System.out.println("Bu kullanýcý adý zaten var ! ");
		}
		else {
			System.out.println("Baþarýyla kayýt oldunuz. ");
			
		}
	}
	
	
	public void login(User user) {
		if(! GoogleAuthManager.googleManager(user)) {
			System.out.println("Þifre yanlýþ ! ");
		}
		else {
			System.out.println("Baþarýyla giriþ yaptýnýz. ");
			
		}
	}
	
	public void passwordChange(User user) {
		if(! GoogleAuthManager.googleManager(user)) {
			System.out.println("Þifre altý karakterden uzun olmalýdýr! ");
		}
		if (GoogleAuthManager.googleManager(user)) {
			System.out.println("Þifre zaten var ! ");
		}
		else {
			System.out.println("Þifreniz deðiþmiþtir. ");
			
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

