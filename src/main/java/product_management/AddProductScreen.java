package product_management;

import java.io.IOException;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddProductScreen {
	public void show() {
		
		StageFactory.getStage();
		StageFactory.getStage().setTitle("Add Product");
		
		Parent actorGroup = null;
		try {
			actorGroup = FXMLLoader.load(getClass().getResource("/Product/AddProduct.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(actorGroup);
		StageFactory.getStage().setScene(scene);
		
		StageFactory.getStage().show();
	}
}
