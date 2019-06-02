package controller.lecturer;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;

public class LecturerLoginController {

    @FXML
    private AnchorPane lecSignInPanel;

    @FXML
    private JFXTextField txtlecUserName;

    @FXML
    private JFXTextField txtLecPassword;

    @FXML
    private Button btnSignIn;

    @FXML
    private ImageView btnClose;

    @FXML
    private Button btnSignUp;

    @FXML
    private Label txterrormsg;

    @FXML
    void closeOnAction(MouseEvent event) {

    }

    @FXML
    void lecPasswordOnAction(ActionEvent event) {

    }

    @FXML
    void lecSignInOnAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("/views/Lecturer/LecturerView.fxml"));
        Scene temp=new Scene(pane);
        Stage window= (Stage) this.lecSignInPanel.getScene().getWindow();
        window.setScene(temp);
        window.centerOnScreen();


    }

    @FXML
    void lecSignUpOnAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("/views/Lecturer/AddLecturer.fxml"));
        Scene temp=new Scene(pane);
        Stage window= (Stage) this.lecSignInPanel.getScene().getWindow();
        window.setScene(temp);
        window.centerOnScreen();

    }

    @FXML
    void lecUserNameOnAction(ActionEvent event) {

    }

    public void closeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
        System.exit(2);
    }
}
