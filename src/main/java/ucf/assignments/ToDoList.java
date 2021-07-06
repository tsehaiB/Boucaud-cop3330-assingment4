/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ToDoList extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //This is where new to do lists will be loaded onto
    //Display mockup loads example of to do list with 10 example to do items
    public void start(Stage primaryStage) {
        try {
            BorderPane root = FXMLLoader.load(getClass().getResource("ToDoListManager.fxml"));
            GridPane center = FXMLLoader.load(getClass().getResource("ToDoItemManager.fxml"));
            for(int i = 1; i < 11; i++){
                AnchorPane item = FXMLLoader.load(getClass().getResource("ToDoListItem.fxml"));
                center.addRow(i);
                center.add(item, 1, i);
            }
            root.setCenter(new ScrollPane(center));

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("My To Do Lists");
            primaryStage.show();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //This is the minimized template for to do lists that will be loaded onto the primary stage*/
}
