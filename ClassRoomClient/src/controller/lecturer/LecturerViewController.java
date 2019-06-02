package controller.lecturer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;

public class LecturerViewController {

    @FXML
    private AnchorPane lecturerViewPane;

    @FXML
    private ImageView btnClose;

    @FXML
    private ImageView btnMinimize;

    @FXML
    private TextArea lecturerTextArea;

    @FXML
    private Button btnNotification;

    @FXML
    private ImageView lblLogOut;

    @FXML
    private ImageView lblSettings;

    @FXML
    void closeOnAction(MouseEvent event) {

    }

    @FXML
    void lecTextAreaOnAction(MouseEvent event) {

    }

    @FXML
    void logoutOnAction(MouseEvent event) {

    }

    @FXML
    void minimizeOnAction(MouseEvent event) {

    }

    @FXML
    void notificationOnAction(ActionEvent event) {

    }

    @FXML
    void stuSettingsOnAction(MouseEvent event) {

    }

    public void closeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void minimizeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void lecTextAreaOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void logoutOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void stuSettingsOnAction(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("/views/Lecturer/LecturerSettings.fxml"));
        Scene temp=new Scene(pane);
        Stage window= (Stage) this.lecturerViewPane.getScene().getWindow();
        window.setScene(temp);
        window.centerOnScreen();
    }
}
