package home;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import product_management.MenuProductScreen;
import user_management.UserMenu;

public class HomeScreenController {
	
    @FXML
    private Button productManagement;

    @FXML
    private Button userManagement;
    
    
//	Show Product Management Menu Page 
   public void productMenuShow() {
	   new MenuProductScreen().show();
   }

   
//   //	Show User Management Menu Page
   public void userMenuShow() {
	   new UserMenu().show();
   } 
}
