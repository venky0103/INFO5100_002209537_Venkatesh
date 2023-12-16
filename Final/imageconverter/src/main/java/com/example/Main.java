package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        try {
            if (scene == null) {
                scene = new Scene(loadFXML("Main"), 600, 400);
            }
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        URL resource = Main.class.getResource(fxml + ".fxml");
        if (resource == null) {
            throw new IOException("FXML file not found: " + fxml);
        }
        fxmlLoader.setLocation(resource);
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}