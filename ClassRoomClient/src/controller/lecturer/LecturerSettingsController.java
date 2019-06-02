package controller.lecturer;

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

public class LecturerSettingsController {

    @FXML
    private AnchorPane lecturerSettingsPane;

    @FXML
    private ImageView btnClose;

    @FXML
    private ImageView btnMinimize;

    @FXML
    private JFXTextField txtSLecId;

    @FXML
    private JFXTextField txtSLecNIC;

    @FXML
    private JFXTextField txtSLecName;

    @FXML
    private Button btnUpdateLec;

    @FXML
    private JFXTextField txtSLecTpNo;

    @FXML
    private ImageView btnMinimize1;

    @FXML
    private ImageView btnHome;

    @FXML
    void closeOnAction(MouseEvent event) {

    }

    @FXML
    void homeOnAction(MouseEvent event) {

    }

    @FXML
    void lecSearchOnAction(ActionEvent event) {

    }

    @FXML
    void minimizeOnAction(MouseEvent event) {

    }

    @FXML
    void sLecNICOnAction(ActionEvent event) {

    }

    @FXML
    void sLecNameOnAction(ActionEvent event) {

    }

    @FXML
    void sLecTpNoOnAction(ActionEvent event) {

    }

    @FXML
    void updateLecOnAction(ActionEvent event) {

    }

    public void closeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void minimizeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void homeOnAction(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("/views/Lecturer/LecturerView.fxml"));
        Scene temp=new Scene(pane);
        Stage window= (Stage) this.lecturerSettingsPane.getScene().getWindow();
        window.setScene(temp);
        window.centerOnScreen();
    }
}
