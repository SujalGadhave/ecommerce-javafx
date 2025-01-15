package product_management;

import java.io.IOException;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DisplayProduct {
public void show() {
		
		StageFactory.getStage();
		StageFactory.getStage().setTitle("Search Product");
		
		Parent actorGroup = null;
		try {
			actorGroup = FXMLLoader.load(getClass().getResource("/Product/DisplayProduct.fxml"));
		} catch (IOException e) {
			System.out.println("Error while opening SearchProduct.fxml");
			e.printStackTrace();
		}
		
		Scene scene = new Scene(actorGroup);
		StageFactory.getStage().setScene(scene);
		
		StageFactory.getStage().show();
	}
}
