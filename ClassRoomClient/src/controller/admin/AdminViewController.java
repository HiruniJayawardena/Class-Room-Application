package controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminViewController implements Initializable {

    @FXML
    private AnchorPane adminPane;

    @FXML
    private ImageView btnClose;

    @FXML
    private ImageView btnMinimize;

    @FXML
    private Button btnViewLecturers;

    @FXML
    private ImageView btnClose11;

    @FXML
    private Button btnAddLessons;

    @FXML
    private Button btnViewReports;

    @FXML
    private Button btnViewQuestion;

    @FXML
    private Button btnViewStudents;

    @FXML
    private AnchorPane adminMiddlePane;

    @FXML
    private Label txtTime;

    @FXML
    private Label txtDate;

    @FXML
    void addLessonsOnAction(ActionEvent event) {
        try {
            AnchorPane pane=FXMLLoader.load(getClass().getResource("/views/admin/Lesson.fxml"));
            adminMiddlePane.getChildren().setAll(pane);
        } catch (IOException e) {
            Logger.getLogger(AdminViewController.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @FXML
    void closeOnAction(MouseEvent event) {

    }

    @FXML
    void minimizeOnAction(MouseEvent event) {

    }

    @FXML
    void viewLecturerOnAction(ActionEvent event) {

    }

    @FXML
    void viewQuestionOnAction(ActionEvent event) {

    }

    @FXML
    void viewReportsOnAction(ActionEvent event) {

    }

    @FXML
    void viewStudentsOnAction(ActionEvent event) {

    }

    public void closeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
        System.exit(2);
    }

    public void minimizeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
        Stage stage= (Stage) ((ImageView) mouseEvent.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
