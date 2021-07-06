/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoItemManagerTest {

    @Test
    void loadItems_given_only_valid() {
        //create ToDoItemManager
        //set currentDirectory equal to directory inside of test/java/ucf/assignments
        //put a few items in the test directory
        //call the loadItems function with titles of items from test directory
        //assert ArrayList items contains all of the loaded items
    }
    @Test
    void loadItems_given_empty() {
        //create ToDoItemManager
        //set currentDirectory equal to directory inside of test/java/ucf/assignments
        //put a 0 items in the test directory
        //call the loadItems function 0 with an empty String ArrayList
        //assert that exception is caught
        //assert that items equals items before function call
    }
    @Test
    void loadItems_given_partially_valid() {
        //create ToDoItemManager
        //set currentDirectory equal to directory inside of test/java/ucf/assignments
        //put a few items in the test directory
        //call the loadItems function with titles of items from test directory
        //assert that all exceptions are caught
        //assert ArrayList items contains all of the loaded items
    }
    @Test
    void saveItems_given_only_valid() {
        //create ToDoItemManager
        //set path equal to directory inside of test/java/ucf/assignments
        //create an arraylist of items
        //create an arraylist of strings with titles that match the item.title of each item
        //call the saveItems function with string arraylist (writing them should return a path)
        //assert path is equal to expected directory path
        //if possible, assert that directory is not equal to directory before calling function
    }
    @Test
    void saveItems_given_empty() {
        //create ToDoItemManager
        //set path equal to directory inside of test/java/ucf/assignments
        //create an arraylist of items, leave it empty
        //create an arraylist of strings, leave it empty
        //call the saveItems function with an empty String ArrayList
        //assert that exception is caught
        //assert that directory equals directory before function call
    }
    @Test
    void saveItems_given_partially_valid() {
        //create ToDoItemManager
        //set path equal to directory inside of test/java/ucf/assignments
        //create an arraylist of items
        //create an arraylist of strings with titles that match the item.title of each item
        //add a few titles that match no items in the directory to the arrayList
        //call the saveItems function with string arraylist (writing them should return a path)
        //assert exceptions thrown with error message
        //assert path is equal to expected directory path
        //if possible, assert that directory is not equal to directory before calling function
    }
    @Test
    void filterItems_given_true() {

    }
    @Test
    void filterItems_given_false() {

    }
    @Test
    void createItem() {
    }

    @Test
    void showItems() {
    }
}