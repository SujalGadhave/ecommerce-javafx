package product_management;

import java.io.IOException;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class RemoveProductScreen {
public void show() {
		
		StageFactory.getStage();
		StageFactory.getStage().setTitle("Remove Product");
		
		Parent actorGroup = null;
		try {
			actorGroup = FXMLLoader.load(getClass().getResource("/Product/RemoveProduct.fxml"));
		} catch (IOException e) {
			System.out.println("Error while opening RemoveProduct.fxml"+e.getMessage());
		}
		
		Scene scene = new Scene(actorGroup);
		StageFactory.getStage().setScene(scene);
		
		StageFactory.getStage().show();
	}
}