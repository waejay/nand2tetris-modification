import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class FXController implements Initializable {
    @FXML
    private Button FXButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FXButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Button Clicked");
            }
        });

    }
}
