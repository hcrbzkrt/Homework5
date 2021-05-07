import java.util.ArrayList;

import business.concretes.UserManager;
import core.GoogleAuthManagerAdapter;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;
import googleAuth.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("1-Giriþ yap Kayýt ol");
		
	    User user = new User();
	    user.setFirstName("Hacer");
	    user.setLastName("Bozkurt");
	    user.setEmail("abc@gmail.com");
	    user.setPassword("123456");
	    
	    System.out.println("      ");
	    UserManager userManager = new UserManager(new GoogleAuthManagerAdapter(new GoogleAuthManager()));
	    System.out.println("Kayýtt");
	    userManager.register(user);;
	    userManager.login(user);
	     
	    
	    System.out.println("      ");
	    InMemoryUserDao inMemoryUserDao = new InMemoryUserDao(new ArrayList<User>());
	    inMemoryUserDao.register(user);
	    inMemoryUserDao.update(user);
	    inMemoryUserDao.login(user);
	    inMemoryUserDao.passwordChange(user);
	    inMemoryUserDao.delete(user);
	    inMemoryUserDao.getByMail("User");
	 
	    
	    System.out.println("      ");
	    GoogleAuthManager googleAuthManager = new GoogleAuthManager();
	    googleAuthManager.register(user);
	    googleAuthManager.login(user);
	    googleAuthManager.passwordChange(user);
	    
	}

}
