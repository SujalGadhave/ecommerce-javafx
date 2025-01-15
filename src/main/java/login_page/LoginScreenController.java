package login_page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.SqlData;
import home.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginScreenController extends SqlData {
	@FXML
	private TextField userName;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private Button login;

	@FXML
	private Label message;

	
	public void login() throws SQLException  {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, sqlpass);
		} catch (SQLException e) {
			System.out.println("Connection not established"+e.getMessage());
		}
		Statement statement = connection.createStatement();
		
		String query = "SELECT * From ecomlogin.login where username = '" + userName.getText() + "'and password = '"
				+ password.getText() + "';";
		
		ResultSet result = statement.executeQuery(query);
		
		if(result.next()) {
			message.setTextFill(Color.GREEN);
			message.setText("login successfully...");
		}else {
			message.setTextFill(Color.RED);
			message.setText("login failed...");
		}
		
		new HomeScreen().show();
	}
}
