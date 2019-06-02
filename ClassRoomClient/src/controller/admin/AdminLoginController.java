package controller.admin;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminLoginController implements Initializable {

    @FXML
    private AnchorPane adminSigninPane;

    @FXML
    private AnchorPane lecSignInPanel;

    @FXML
    private JFXTextField txtAddUserName;

    @FXML
    private JFXTextField txtAdPw;

    @FXML
    private Button btnSignIn;

    @FXML
    private ImageView btnClose;

    @FXML
    private Label txterrormsg;

    @FXML
    void adPwOnAction(ActionEvent event) {

    }

    @FXML
    void adSignIn(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("/views/admin/AdminView.fxml"));
        Scene temp=new Scene(pane);
        Stage window= (Stage) this.adminSigninPane.getScene().getWindow();
        window.setScene(temp);
        window.centerOnScreen();

    }

    @FXML
    void adUserNameOnAction(ActionEvent event) throws IOException {

    }

    @FXML
    void closeOnAction(MouseEvent event) {

    }

    public void closeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
        System.exit(2);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
