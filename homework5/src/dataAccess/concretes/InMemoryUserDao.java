package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao{
 
	private ArrayList<User> users;
	
	public InMemoryUserDao(ArrayList<User>users) {
		this.users = users;
	}
	
	@Override
	public void register(User user) {
		System.out.println("Kayýt yapýldý : " + user.getEmail());
	}
	
	public void udpate(User user) {
		users.remove(user);
		System.out.println("Emailiniz güncellendi : " + user.getEmail());
	}
	
	@Override
	public void login(User user) {
		System.out.println("Giriþ yapýldý : " + user.getFirstName() + " " + user.getLastName());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi : " + user.getFirstName() + " " + user.getLastName());
	}
	
	
	public void passwordChange(User user) {
		System.out.println("Þifreniz deðiþtirildi : " + user.getPassword());
	}

	
	
	public User getByMail(String mail) {
	      for (User user : users) {
	        if (user.getEmail().equals(mail)){
	           return user;
	          }
	      }
	      return null;
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi. ");
		
	}

	@Override
	public void paswordChange(User user) {
		System.out.println("Þifre deðiþtirildi. ");
		
	}
}
