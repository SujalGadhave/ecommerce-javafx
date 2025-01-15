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

public class AddProductController extends SqlData {

    @FXML
    private TextField productId;

    @FXML
    private TextField productName;

    @FXML
    private TextField productPrice;

    @FXML
    private TextField productQuantity;

    @FXML
    private Label errorMessage;
    
    public void addProduct() throws SQLException {
    	Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,username,sqlpass);
		} catch (SQLException e) {
			System.out.println("Connection not established" +e.getMessage());
		}
		
		Statement statement = connection.createStatement();
		
		String query = "INSERT INTO ecomlogin.product (productid,productname,productprice,productquantity)" + 
				"VALUES('" + productId.getText() + "','" + productName.getText() + "','" +productPrice.getText()+ "','"+ productQuantity.getText() +"');";
		
		statement.execute(query);
		
		if((productId.getText() != null && productName.getText() != null) && (productPrice.getText() != null && productQuantity.getText() != null)) {
			errorMessage.setTextFill(Color.GREEN);
			errorMessage.setText("Product added successfuly...");
			
		}else {
			errorMessage.setTextFill(Color.RED);
			errorMessage.setText("Something went wrong...");
			
		}
    }
    
    public void back() {
    	new MenuProductScreen().show();
    }
}
