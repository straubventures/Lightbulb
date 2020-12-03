package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.*;

public class CreateUserController {
    @FXML
    private TextField firstNameTxt;

    @FXML
    private TextField lastNameTxt;

    @FXML
    private TextField dateOfBirthTxt;

    @FXML
    private TextField emailAddressTxt;

    @FXML
    private TextField usernameTxt;

    @FXML
    private TextField passwordTxt;

    @FXML
    private TextField confirmPasswordTxt;

    @FXML
    private Button createUserSubmit;

    @FXML
    void onSubmitCreateUser(ActionEvent event) {

    }
}
