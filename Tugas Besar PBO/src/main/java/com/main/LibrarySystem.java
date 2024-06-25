package com.main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LibrarySystem extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI controls
        Label titleLabel = new Label("Login Anggota Perpustakaan UMM");
        TextField usernameField = new TextField();
        usernameField.setPromptText("Kode Anggota / NIM UMM / Email UMM");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("PIC / Password");

        Label verificationLabel = new Label("Verifikasi telah berakhir. Centang kotak lagi.");
        verificationLabel.setStyle("-fx-text-fill: red;");
        verificationLabel.setVisible(false);

        CheckBox captchaCheckBox = new CheckBox("Saya bukan robot");

        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: #007bff; -fx-text-fill: white;");
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (captchaCheckBox.isSelected()) {
                    // Login logic here
                    System.out.println("Login successful");
                } else {
                    verificationLabel.setVisible(true);
                }
            }
        });

        Button registerButton = new Button("Registrasi Anggota Umum");
        registerButton.setStyle("-fx-background-color: #28a745; -fx-text-fill: white;");
        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Register logic here
                System.out.println("Register button clicked");
            }
        });

        // Layout the UI
        VBox vbox = new VBox(10, titleLabel, usernameField, passwordField, verificationLabel, captchaCheckBox, loginButton, registerButton);
        vbox.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-background-color: white;");

        StackPane root = new StackPane(vbox);
        root.setStyle("-fx-background-color: #87CEEB;"); // Changed background color to blue

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("myUMM Library");
        primaryStage.setFullScreen(true); // Set to full screen
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}