package develop.fizbuzz;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label exit;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

        exit.setText("exit button pressed!");
    }
}