package sample;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpSerName;

    @FXML
    private TextField signUpName;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private TextField signUpLocation;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField loginInput;

    @FXML
    private TextField passwordInput;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    void initialize() {

    }
}