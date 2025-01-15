package user_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.SqlData;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SearchUserController extends SqlData {
	
	@FXML
	private TextField searchUser;

    @FXML
    Label errorMessage;
    
    public void searchUser() throws SQLException {
    	Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,username,sqlpass);
		} catch (SQLException e) {
			System.out.println("Connection not established");
			e.printStackTrace();
		}
		
		Statement statement = connection.createStatement();
		
		String query = "SELECT * From ecomlogin.user where username = '" + searchUser.getText() + "';";
		
		ResultSet result = statement.executeQuery(query);
		
		if(result.next()) {
			errorMessage.setTextFill(Color.GREEN);
			errorMessage.setText(searchUser.getText());
		}else {
			errorMessage.setTextFill(Color.RED);
			errorMessage.setText("Product not found...");
		}
    }
    
    public void back() {
    	new UserMenu().show();
    }

}
