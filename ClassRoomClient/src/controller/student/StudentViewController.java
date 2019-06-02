package controller.student;

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

public class StudentViewController {

    @FXML
    private AnchorPane studentViewPane;

    @FXML
    private ImageView btnClose;

    @FXML
    private ImageView btnMinimize;

    @FXML
    private TextArea studentTextArea;

    @FXML
    private TextArea txtStumsg;

    @FXML
    private Button btnSubmit;

    @FXML
    private ImageView lblLogOut;

    @FXML
    private ImageView lblSettings;

    @FXML
    void closeOnAction(MouseEvent event) {

    }

    @FXML
    void logoutOnAction(MouseEvent event) {

    }

    @FXML
    void minimizeOnAction(MouseEvent event) {

    }

    @FXML
    void stuMsgOnAction(MouseEvent event) {

    }

    @FXML
    void stuSettingsOnAction(MouseEvent event) {

    }

    @FXML
    void studentTextAreaOnAction(MouseEvent event) {

    }

    @FXML
    void submitOnAction(ActionEvent event) {

    }

    public void closeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
        System.exit(2);
    }

    public void minimizeOnAction(javafx.scene.input.MouseEvent mouseEvent) {

    }

    public void studentTextAreaOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void stuMsgOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void logoutOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void stuSettingsOnAction(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("/views/student/StudentSettings.fxml"));
        Scene temp=new Scene(pane);
        Stage window= (Stage) this.studentViewPane.getScene().getWindow();
        window.setScene(temp);
        window.centerOnScreen();

    }
}
