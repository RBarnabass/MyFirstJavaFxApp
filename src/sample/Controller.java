package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button enterButton;

    @FXML
    private TextField loginInput;

    @FXML
    private TextField passwordInput;

    @FXML
    private Button regButton;

    @FXML
    void initialize() {
        enterButton.setOnAction(event -> System.out.println("You pressed enter button"));
    }
}