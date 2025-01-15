package user_management;

import java.io.IOException;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DisplayUserScreen {
public void show() {
		
		StageFactory.getStage();
		StageFactory.getStage().setTitle("Display User");
		
		Parent actorGroup = null;
		try {
			actorGroup = FXMLLoader.load(getClass().getResource("/User/DisplayUser.fxml"));
		} catch (IOException e) {
			System.out.println("Error while opening DisplayUser.fxml");
			e.printStackTrace();
		}
		
		Scene scene = new Scene(actorGroup);
		StageFactory.getStage().setScene(scene);
		
		StageFactory.getStage().show();
	}
}
