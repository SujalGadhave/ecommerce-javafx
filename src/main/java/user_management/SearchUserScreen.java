package user_management;

import java.io.IOException;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchUserScreen {
	public void show() {
		
		StageFactory.getStage();
		StageFactory.getStage().setTitle("Search User");
		
		Parent actorGroup = null;
		try {
			actorGroup = FXMLLoader.load(getClass().getResource("/User/SearchUser.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scene scene = new Scene(actorGroup);
		StageFactory.getStage().setScene(scene);
		
		StageFactory.getStage().show();
	}
}
