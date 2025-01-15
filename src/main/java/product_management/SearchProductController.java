package product_management;

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

public class SearchProductController extends SqlData {

	    @FXML
	    private TextField searchProduct;

	    @FXML
	    private Label errorMessage;
	    
	    public void searchProduct() throws SQLException {
	    	Connection connection = null;
			try {
				connection = DriverManager.getConnection(url,username,sqlpass);
			} catch (SQLException e) {
				System.out.println("Error while establishing connection with database");
				e.printStackTrace();
			}
			
			Statement statement = connection.createStatement();
			
			String query = "SELECT * From ecomlogin.product where productname = '" + searchProduct.getText() + "';";
			
			ResultSet result = statement.executeQuery(query);
			
			if(result.next()) {
				errorMessage.setTextFill(Color.GREEN);
				errorMessage.setText(searchProduct.getText());
			}else {
				errorMessage.setTextFill(Color.RED);
				errorMessage.setText("Product not found...");
			}
	    }
	    
	    public void back() {
	    	new MenuProductScreen().show();
	    }
}
