package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.nio.file.Path;
import java.util.ArrayList;
import java.io.FileWriter;

public class ToDoListManager {
    @FXML
    private TextField savePath;
    @FXML
    private TextField loadPath;
    @FXML
    private TextField ListTitle;
    private Path listSavePath;
    private Path listLoadPath;
    private String listTitle;
    private ArrayList<ToDoList> lists;
    public void SaveToPath(ActionEvent actionEvent) {
        //set listSavePath instance variable equal to savePath textfield's current value
        //call retPathToLists with listSavePath + rootDir as directPath
    }
    public Path retPathToLists(Path directPath){
        //see if directory with path name exists
        //otherwise, create a directory in rootDir using the path name
        //return with error if cannot create a directory at that path name
        //(e.g. savePath = myListsforSummer, and directory = rootDir/myListsForSummer/)
        //for list in lists ArrayList, make a directory at this path with the same name as the title of the list
        //and call the list function 'saveItems' with this directory's path as a parameter
        //to save every item to this list's directory

        //return the path to the directory that all lists are contained in
        return directPath;
    }

    public void LoadFromPath(ActionEvent actionEvent) {
        //set listLoadPath instance variable equal to loadPath textfield's current value
        //call retToDoItems with listLoadPath as directPath
    }
    public ArrayList<ToDoList> retToDoLists(Path directPath){
        //set listLoadPath instance variable equal to loadPath textfield's current value
        //return with error if directory does not exist
        //otherwise, create a File Reader that's path is loadPath name
        //(e.g. loadPath = rootDir/myListsForSummer/, and file reader reads from myListsForSummer)
        //for every directory at that path, create a new list with addList, use directory as title parameter
        //, call list function 'loadItems' with this list as a parameter to save every item to the new list
        //add this list to the ArrayList of lists and display it with showList function
        return lists;
    }
    public void CreateList(ActionEvent actionEvent) {
        //set listTitle equal to current ListTitle value
        //add list to list array by calling the addList function with listTitle as the title parameter
    }
    public ArrayList<ToDoList> addList(String title){
        //create a new instance of ToDoList
        //set title instance variable equal to title
        //set rootDir to default directory
        //display new list with showList function
        return lists;
    }
    public void showList(){
        //show the newest list in the Arraylist lists,
        //possibly by stacking it on top with a stackpane,
        //or changing the scene
    }
}
