package controller.student;

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

public class StudentLoginController {

    @FXML
    private AnchorPane studentSigninPane;

    @FXML
    private AnchorPane lecSignInPanel;

    @FXML
    private JFXTextField txtstuUserName;

    @FXML
    private JFXTextField txtStuPw;

    @FXML
    private Button btnSignIn;

    @FXML
    private ImageView btnClose;

    @FXML
    private Button btnSignUp;

    @FXML
    private Label txterrormsg;

    @FXML
    void adPwOnAction(ActionEvent event) {

    }

    @FXML
    void closeOnAction(MouseEvent event) {

    }

    @FXML
    void stSignIn(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("/views/student/StudentView.fxml"));
        Scene temp=new Scene(pane);
        Stage window= (Stage) this.studentSigninPane.getScene().getWindow();
        window.setScene(temp);
        window.centerOnScreen();

    }

    @FXML
    void stSignUp(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("/views/student/AddStudent.fxml"));
        Scene temp=new Scene(pane);
        Stage window= (Stage) this.studentSigninPane.getScene().getWindow();
        window.setScene(temp);
        window.centerOnScreen();

    }

    @FXML
    void stUserNameOnAction(ActionEvent event) {

    }

    public void closeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
        System.exit(2);
    }
}
