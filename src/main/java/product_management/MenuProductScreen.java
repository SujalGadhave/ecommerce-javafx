package product_management;

import java.io.IOException;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MenuProductScreen {
	public void show() {
    	
    	StageFactory.getStage();
		StageFactory.getStage().setTitle("Product Management Menu");
		Parent actorGroup = null;
		try {
			actorGroup = FXMLLoader.load(getClass().getResource("/Product/MainProduct.fxml"));
		} catch (IOException e) {
			System.out.println("Error while opening MainProduct.fxml");
			e.printStackTrace();
		}
		
		Scene scene = new Scene(actorGroup);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();
  
    }
}
