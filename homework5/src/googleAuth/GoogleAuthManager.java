package googleAuth;

import entities.concretes.User;

public class GoogleAuthManager {

	public void register(User user) {
		System.out.println("Kullan�c� kay�t yapt� : " + user.getFirstName() + " "  +  user.getLastName());
	}
	

	public void login(User user) {
		System.out.println("Kullan�c� giri� yapt� : " + user.getFirstName() + " "  + user.getLastName());
	}
	

	public void passwordChange(User user) {
		System.out.println("Kullan�c� �ifreyi de�i�tirdi : " + user.getEmail() + " "  +  user.getPassword());
	}


	public static boolean googleManager(User user) {
		System.out.println(" ");
		return true;
	}
	
}
