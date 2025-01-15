package product_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import common.SqlData;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class RemoveProductController extends SqlData {
	
	@FXML
	private TextField removeProduct;
		
	@FXML
    private Label errorMessage;
		
	public void removeProduct() throws SQLException {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,username,sqlpass);
		} catch (SQLException e) {
			System.out.println("Error while establishing connection with database");
			e.printStackTrace();
		}
		
		Statement statement = connection.createStatement();
		
		String query = "DELETE FROM ecomlogin.product WHERE productname = '" + removeProduct.getText() + "'";
		
		statement.execute(query);
		
		if((removeProduct.getText() != null)) {
			
			errorMessage.setTextFill(Color.GREEN);
			errorMessage.setText("Product removed...");
		}else {
			errorMessage.setTextFill(Color.RED);
			errorMessage.setText("Something went wrong...");
		}
	}
	
	public void back() {
		new MenuProductScreen().show();
	}
}
