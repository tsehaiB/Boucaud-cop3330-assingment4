package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ToDoList extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    private BorderPane root;
    private Stage stage;
    private Scene scene;
    private Insets INSETS = new Insets(10, 10, 10, 10);

    @Override
    public void start(Stage primaryStage) {
        try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("EditToDoItem.fxml"));

            for(int i = 0; i < 4; i++) {
                AnchorPane item = FXMLLoader.load(getClass().getResource("ToDoListItem.fxml"));
                //root.add(item, 0, 0, 2, 8);
            }

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("My To Do List");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
