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

public class StudentSettingsController {

    @FXML
    private AnchorPane studentSettingsPane;

    @FXML
    private ImageView btnClose;

    @FXML
    private ImageView btnMinimize;

    @FXML
    private JFXTextField txtSStuId;

    @FXML
    private JFXTextField txtSStuNIC;

    @FXML
    private JFXTextField txtSStuName;

    @FXML
    private Button btnUpdateStudent;

    @FXML
    private JFXTextField txtSSTpNo;

    @FXML
    private ImageView btnMinimize1;

    @FXML
    private ImageView btnHome;

    @FXML
    void closeOnAction(MouseEvent event) {

    }

    @FXML
    void minimizeOnAction(MouseEvent event) {

    }

    @FXML
    void sSTpNoOnAction(ActionEvent event) {

    }

    @FXML
    void sStuNICOnAction(ActionEvent event) {

    }

    @FXML
    void sStuNameOnAction(ActionEvent event) {

    }

    @FXML
    void searchStudentOnAction(ActionEvent event) {

    }

    @FXML
    void homeOnAction(MouseEvent event) throws IOException {

    }

    @FXML
    void updateStudentOnAction(ActionEvent event) {

    }

    public void closeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
        System.exit(2);
    }

    public void minimizeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void homeOnAction(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("/views/student/StudentView.fxml"));
        Scene temp=new Scene(pane);
        Stage window= (Stage) this.studentSettingsPane.getScene().getWindow();
        window.setScene(temp);
        window.centerOnScreen();

    }
}
