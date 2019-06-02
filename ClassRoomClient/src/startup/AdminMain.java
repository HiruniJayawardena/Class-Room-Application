package startup;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AdminMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root=FXMLLoader.load(this.getClass().getResource("/views/admin/AdminLogin.fxml"));
        Scene scene=new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
