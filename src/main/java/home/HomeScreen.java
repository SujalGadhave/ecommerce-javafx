package home;

import java.io.IOException;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeScreen {
	public void show() {
		StageFactory.getStage().setTitle("Menu");
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("/Menu/MenuPage.fxml"));
		} catch (IOException e) {
			System.out.println("Error while opening MenuPage.fxml");
			e.printStackTrace();
			System.exit(0);
		}
		
		Scene scene = new Scene(root);
		StageFactory.getStage().setScene(scene);
		StageFactory.getStage().show();
	}
}
