package controller.student;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;

public class AddStudentController {

    @FXML
    private AnchorPane addStuPane;

    @FXML
    private ImageView btnClose;

    @FXML
    private ImageView btnMinimize;

    @FXML
    private JFXTextField txtStuId;

    @FXML
    private JFXTextField txtStuNIC;

    @FXML
    private JFXTextField txtStuName;

    @FXML
    private JFXTextField txtStuTp;

    @FXML
    private Button btnAddStudent;

    @FXML
    private ImageView btnHome;

    @FXML
    void addStudentOnAction(ActionEvent event) {

    }

    @FXML
    void closeOnAction(MouseEvent event) {

    }

    @FXML
    void minimizeOnAction(MouseEvent event) {

    }

    @FXML
    void stuIdOnAction(ActionEvent event) {

    }

    @FXML
    void stuNICOnAction(ActionEvent event) {

    }

    @FXML
    void stuNameOnAction(ActionEvent event) {

    }

    @FXML
    void stuTpOnAction(ActionEvent event) {

    }

    @FXML
    void homeOnAction(MouseEvent event) {

    }

    public void closeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
        System.exit(2);
    }

    public void minimizeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void homeOnAction(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("/views/student/StudentView.fxml"));
        Scene temp=new Scene(pane);
        Stage window= (Stage) this.addStuPane.getScene().getWindow();
        window.setScene(temp);
        window.centerOnScreen();
    }
}
