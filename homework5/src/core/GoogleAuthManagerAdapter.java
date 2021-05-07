package core;

import entities.concretes.User;
import googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

	private final GoogleAuthManager  googleAuthManager;
	
	public  GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
		this.googleAuthManager = googleAuthManager;
	}

	public void register(User user) {
		googleAuthManager.register(user);
	}
	
	public void login(User user) {
		googleAuthManager.register(user);
	}
	
	public void passwordChange(User user) {
		googleAuthManager.register(user);
	}
	
	
		
	}
	
	

