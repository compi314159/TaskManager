package com.example.taskmanager;

// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TaskViewer extends Application {
    private String task1;
    private String task2;
    private String task3;
    private String task4;
    private String task5;
    private String task6;
    private String task7;
    private String task8;
    private String task9;
    private String task10;
    private TextField addField = new TextField();
    private Button addButton = new Button("Add Task");
    private Button updateButton = new Button("Update");
    private CheckBox task1CheckBox = new CheckBox(task1);
    private CheckBox task2CheckBox = new CheckBox(task2);
    private CheckBox task3CheckBox = new CheckBox(task3);
    private CheckBox task4CheckBox = new CheckBox(task4);
    private CheckBox task5CheckBox = new CheckBox(task5);
    private CheckBox task6CheckBox = new CheckBox(task6);
    private CheckBox task7CheckBox = new CheckBox(task7);
    private CheckBox task8CheckBox = new CheckBox(task8);
    private CheckBox task9CheckBox = new CheckBox(task9);
    private CheckBox task10CheckBox = new CheckBox(task10);
    private ArrayList<String> tasks = new ArrayList<>();
    private void addTask(String task) throws Exception {
        tasks.add(task);
        addField.setText("");
        displayTasks();
    }
    private void removeTasks() {
        if(task1CheckBox.isSelected())
        {
            tasks.remove(task1CheckBox.getText());
        }
        if(task2CheckBox.isSelected())
        {
            tasks.remove(task2CheckBox.getText());
        }
        if(task3CheckBox.isSelected())
        {
            tasks.remove(task3CheckBox.getText());
        }
        if(task4CheckBox.isSelected())
        {
            tasks.remove(task4CheckBox.getText());
        }
        if(task5CheckBox.isSelected())
        {
            tasks.remove(task5CheckBox.getText());
        }
        if(task6CheckBox.isSelected())
        {
            tasks.remove(task6CheckBox.getText());
        }
        if(task7CheckBox.isSelected())
        {
            tasks.remove(task7CheckBox.getText());
        }
        if(task8CheckBox.isSelected())
        {
            tasks.remove(task8CheckBox.getText());
        }
        if(task9CheckBox.isSelected())
        {
            tasks.remove(task9CheckBox.getText());
        }
        if(task10CheckBox.isSelected())
        {
            tasks.remove(task10CheckBox.getText());
        }

        task1CheckBox.setText("");
        task2CheckBox.setText("");
        task3CheckBox.setText("");
        task4CheckBox.setText("");
        task5CheckBox.setText("");
        task6CheckBox.setText("");
        task7CheckBox.setText("");
        task8CheckBox.setText("");
        task9CheckBox.setText("");
        task10CheckBox.setText("");
        task1CheckBox.setSelected(false);
        task2CheckBox.setSelected(false);
        task3CheckBox.setSelected(false);
        task4CheckBox.setSelected(false);
        task5CheckBox.setSelected(false);
        task6CheckBox.setSelected(false);
        task7CheckBox.setSelected(false);
        task8CheckBox.setSelected(false);
        task9CheckBox.setSelected(false);
        task10CheckBox.setSelected(false);
        displayTasks();
    }
    private void displayTasks()
    {
        task1CheckBox.setText(tasks.get(0));
        task2CheckBox.setText(tasks.get(1));
        task3CheckBox.setText(tasks.get(2));
        task4CheckBox.setText(tasks.get(3));
        task5CheckBox.setText(tasks.get(4));
        task6CheckBox.setText(tasks.get(5));
        task7CheckBox.setText(tasks.get(6));
        task8CheckBox.setText(tasks.get(7));
        task9CheckBox.setText(tasks.get(8));
        task10CheckBox.setText(tasks.get(9));
    }
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Task Manager");
        VBox mainBox = new VBox(25);
        mainBox.setPadding(new Insets(10, 10, 20, 10));
        //add task
        HBox addBox = new HBox(10);
        addBox.setAlignment(Pos.BASELINE_LEFT);
        Label addLabel = new Label("Task: ");
        addLabel.setMinWidth(50); // adjust the label width to match phone
        addBox.getChildren().add(addLabel);
        addField.setMinWidth(200); // make TextField bigger for longer names
        addBox.getChildren().add(addField);
        addButton.setOnAction(event -> {
            try {
                addTask(addField.getText());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        addBox.getChildren().add(addButton);
        mainBox.getChildren().add(addBox); // add it to the VBox for main application


        VBox taskBox = new VBox(10);
        taskBox.setAlignment(Pos.BASELINE_LEFT);
        taskBox.getChildren().add(task1CheckBox);
        taskBox.getChildren().add(task2CheckBox);
        taskBox.getChildren().add(task3CheckBox);
        taskBox.getChildren().add(task4CheckBox);
        taskBox.getChildren().add(task5CheckBox);
        taskBox.getChildren().add(task6CheckBox);
        taskBox.getChildren().add(task7CheckBox);
        taskBox.getChildren().add(task8CheckBox);
        taskBox.getChildren().add(task9CheckBox);
        taskBox.getChildren().add(task10CheckBox);
        taskBox.getChildren().add(updateButton);
        updateButton.setOnAction(event -> removeTasks());
        mainBox.getChildren().add(taskBox); // add it to the VBox for main application


        // final setup and show app
        Scene scene = new Scene(mainBox);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}