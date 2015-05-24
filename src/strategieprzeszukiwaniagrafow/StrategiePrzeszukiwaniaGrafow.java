/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategieprzeszukiwaniagrafow;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author greg
 */
public class StrategiePrzeszukiwaniaGrafow extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Button nextBtn = new Button();
        nextBtn.setText(" Next ");
        nextBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.err.println("next step");
            }
        });
        
        root.getChildren().add(nextBtn);
        nextBtn.setLayoutX(5);
        nextBtn.setLayoutY(5);
        
        Button prevBtn = new Button();
        prevBtn.setText(" Prev ");
        prevBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.err.println("prev step");
            }
        });
        root.getChildren().add(prevBtn);
        prevBtn.setLayoutX(65);
        prevBtn.setLayoutY(5);
        
        Scene scene = new Scene(root, 700, 700);
        
        primaryStage.setTitle("Strategie przeszukiwania grafów");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}