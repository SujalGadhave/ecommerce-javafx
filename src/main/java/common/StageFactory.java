package common;

import javafx.stage.Stage;


public class StageFactory {
private static Stage stage;
	
	public static Stage getStage() {
		return stage;
	}
	
	public static void setStage(Stage tempStage) {
		stage = tempStage;
	}
}
