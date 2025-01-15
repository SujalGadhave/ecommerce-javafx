package user_management;

import home.HomeScreen;

public class UserMenuController {
	
	public void addUser() {
		new AddUserScreen().show();
	}
	
	public void searchUser() {
		new SearchUserScreen().show();
	}
	
	public void displayUser() {
		new DisplayUserScreen().show();
	}
	
	public void removeUser() {
		new RemoveUserScreen().show();
	}
	
	public void back() {
		new HomeScreen().show();
	}
}
