/**
 * Sample Skeleton for 'ProvaView.fxml' Controller Class
 */

package provafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProvaController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnSaluta"
    private Button btnSaluta; // Value injected by FXMLLoader
    
    @FXML // fx:id="btnSaluta"
    private Button btnSaluta2; // Value injected by FXMLLoader

    @FXML
    void onSaluta(ActionEvent event) {
       System.out.println("Ciao Ciao");
    }
    
    @FXML
    void onSaluta2(ActionEvent event) {
       System.out.println("Addio");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnSaluta != null : "fx:id=\"btnSaluta\" was not injected: check your FXML file 'ProvaView.fxml'.";
        assert btnSaluta2 != null : "fx:id=\"btnSaluta2\" was not injected: check your FXML file 'ProvaView.fxml'.";

    }
}