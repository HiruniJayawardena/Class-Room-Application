package controller.admin;

import com.jfoenix.controls.JFXTextField;
import dto.LessonDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import proxy.ProxyHandler;
import service.ServiceFactory;
import service.custom.LessonService;
import service.custom.impl.LessonServiceImpl;

import java.net.URL;
import java.util.ResourceBundle;

public class LessonController implements Initializable {

    private static LessonService lessonService;

//    static {
//        try {
//                lessonService=new LessonServiceImpl();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @FXML
    private AnchorPane lessonPane;

    @FXML
    private JFXTextField txtLessonId;

    @FXML
    private JFXTextField txtSubject;

    @FXML
    private Button btnUpdateLesson;

    @FXML
    private Button btnAddLesson;

    @FXML
    private Button btnDeleteLesson;

    @FXML
    private TableView<?> tblLesson;

    @FXML
    private JFXTextField txtSearchLesson;

    @FXML
    void addLessonOnAction(ActionEvent event) throws Exception {
        LessonDTO lessonDTO=new LessonDTO(
                txtLessonId.getText(),
                txtSubject.getText());
                boolean isAdded=lessonService.addLesson(lessonDTO);

                if(isAdded){

                    Alert error=new Alert(Alert.AlertType.ERROR,"Something went wrong", ButtonType.OK);
                    error.show();

                }else {
                    Alert alert=new Alert(Alert.AlertType.INFORMATION,"Added Successfully", ButtonType.OK);
                    alert.show();
                }
//        addLesson((LessonDTO) lessonService);

    }

    @FXML
    void deleteLessonOnAction(ActionEvent event) {

    }

    @FXML
    void lessonIdOnAction(ActionEvent event) {

    }

    @FXML
    void searchLessonOnAction(ActionEvent event) {

    }

    @FXML
    void subjectOnAction(ActionEvent event) {

    }

    @FXML
    void updateLessonOnAction(ActionEvent event) {

    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            lessonService=ProxyHandler.getInstance().getSuperService(ServiceFactory.ServiceTypes.LESSON);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
