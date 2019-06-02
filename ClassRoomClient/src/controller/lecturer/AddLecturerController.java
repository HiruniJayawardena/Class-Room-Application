package controller.lecturer;

import com.jfoenix.controls.JFXTextField;
import dto.LecturerDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import proxy.ProxyHandler;
import service.ServiceFactory;
import service.custom.LecturerService;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddLecturerController implements Initializable {
    private static LecturerService lecturerService;

    @FXML
    private AnchorPane addLecturerPane;

    @FXML
    private ImageView btnClose;

    @FXML
    private ImageView btnMinimize;

    @FXML
    private JFXTextField txtLecturerId;

    @FXML
    private JFXTextField txtLessonId;

    @FXML
    private JFXTextField txtLecNIC;

    @FXML
    private JFXTextField txtLecName;

    @FXML
    private JFXTextField txtLecTp;

    @FXML
    private Button btnAddLecturer;


    @FXML
    private ImageView btnHome;


    @FXML
    void homeOnAction(MouseEvent event) {

    }

    @FXML
    void addLecturerOnAction(ActionEvent event) throws Exception {
        LecturerDTO lecturerDTO=new LecturerDTO(
                txtLecturerId.getText(),
                txtLecName.getText(),
                txtLecNIC.getText(),
                Integer.parseInt(txtLecTp.getText()),
                txtLessonId.getText()
        );
        boolean isAdded=lecturerService.addLecturer(lecturerDTO);
        if(isAdded){
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Added Successfully", ButtonType.OK);
            alert.show();
        }else {
            Alert error=new Alert(Alert.AlertType.ERROR,"Something went wrong",ButtonType.OK);
            error.show();
        }

    }

    @FXML
    void closeOnAction(MouseEvent event) {

    }

    @FXML
    void lecNICOnAction(ActionEvent event) {

    }

    @FXML
    void lecNameOnAction(ActionEvent event) {

    }

    @FXML
    void lecTpOnAction(ActionEvent event) {

    }

    @FXML
    void lecturerIdOnAction(ActionEvent event) {

    }

    @FXML
    void lessonIdOnAction(ActionEvent event) {

    }

    @FXML
    void minimizeOnAction(MouseEvent event) {

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
        try {
            lecturerService=ProxyHandler.getInstance().getSuperService(ServiceFactory.ServiceTypes.LECTURER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void homeOnAction(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("/views/Lecturer/LecturerView.fxml"));
        Scene temp=new Scene(pane);
        Stage window= (Stage) this.addLecturerPane.getScene().getWindow();
        window.setScene(temp);
        window.centerOnScreen();
    }
}
