package user_management;

public class User {
	 private int userId;
	    private String userName;
	    private String email;
	    private String password;

	    public User(int userId, String userName, String email, String password) {
	        this.userId = userId;
	        this.userName = userName;
	        this.email = email;
	        this.password = password;
	    }

	    public int getUserId() {
	        return userId;
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getPassword() {
	        return password;
	    }
}
