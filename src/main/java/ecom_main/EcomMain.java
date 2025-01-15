package ecom_main;

import common.StageFactory;
import javafx.application.Application;
import javafx.stage.Stage;
import login_page.LoginScreen;

public class EcomMain extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}


	public void start(Stage primaryStage) throws Exception {
		StageFactory.setStage(primaryStage);
		new LoginScreen().show();
	}
}
