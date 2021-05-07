package googleAuth;

import entities.concretes.User;

public class GoogleAuthManager {

	public void register(User user) {
		System.out.println("Kullanýcý kayýt yaptý : " + user.getFirstName() + " "  +  user.getLastName());
	}
	

	public void login(User user) {
		System.out.println("Kullanýcý giriþ yaptý : " + user.getFirstName() + " "  + user.getLastName());
	}
	

	public void passwordChange(User user) {
		System.out.println("Kullanýcý þifreyi deðiþtirdi : " + user.getEmail() + " "  +  user.getPassword());
	}


	public static boolean googleManager(User user) {
		System.out.println(" ");
		return true;
	}
	
}
