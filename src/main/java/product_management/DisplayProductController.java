package product_management;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.SqlData;

public class DisplayProductController extends SqlData {
    @FXML
    private TableView<Product> productTable;

    @FXML
    private TableColumn<Product, Integer> columnProductId;

    @FXML
    private TableColumn<Product, String> columnName;

    @FXML
    private TableColumn<Product, String> columnQuantity;

    @FXML
    private TableColumn<Product, String> columnPrice;
    
    @FXML
    private Button back;

    private ObservableList<Product> productList = FXCollections.observableArrayList();

    private void loadDataFromDatabase() throws SQLException {
    	Connection connection = null;
    	try {
    		connection = DriverManager.getConnection(url,username,sqlpass);
    	} catch (SQLException e) {
    		System.out.println("Connection not established...");
    		e.printStackTrace();
    	}
    	
    	Statement statement = connection.createStatement();
    	
    	String query = "SELECT * FROM ecomlogin.product";
    	
    	ResultSet resultSet = statement.executeQuery(query);
    	
    	while (resultSet.next()) {
    		int productId = resultSet.getInt("productid");
    		String name = resultSet.getString("productname");
    		String quantity = resultSet.getString("productprice");
    		String price = resultSet.getString("productquantity");
    		
    		productList.add(new Product(productId, name, quantity, price));
    	}   
    	
    	productTable.setItems(productList);
    	
    }
    public void initialize() throws SQLException {
        // Set up the columns
        columnProductId.setCellValueFactory(new PropertyValueFactory<>("productId"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        columnPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        // Load data from the database
        loadDataFromDatabase();
    }

    
    public void back() {
    	new MenuProductScreen().show();
    }
}