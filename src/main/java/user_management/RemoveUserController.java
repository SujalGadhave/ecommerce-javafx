package user_management;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import common.SqlData;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class RemoveUserController extends SqlData{
	
	@FXML
	private TextField removeUser;

	@FXML
    private Label errorMessage;
	
	public void removeUser() throws SQLException {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,username,sqlpass);
		} catch (SQLException e) {
			System.out.println("Connection not established...");
			e.printStackTrace();
		}
		
		Statement statement = connection.createStatement();
		
		String query = "DELETE FROM ecomlogin.user WHERE username = '" + removeUser.getText() + "'";
		
		statement.execute(query);
		
		if((removeUser.getText() != null)) {
			
			errorMessage.setTextFill(Color.GREEN);
			errorMessage.setText("User removed...");
			
		}else {
			
			errorMessage.setTextFill(Color.RED);
			errorMessage.setText("Something went wrong...");
			
		}
	}
	
	public void back() {
    	new UserMenu().show();
    }

}
