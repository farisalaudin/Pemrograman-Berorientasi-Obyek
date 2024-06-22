package main.codelab;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


import javafx.scene.text.Font;

import javafx.scene.text.FontWeight;
import javafx.stage.Stage;



public class LoginGUI extends Application {

   public static String username = "admin";
    public static String password = "admin";

//============================================ MAIN METHOD ===============================================
    public static void main(String[] args){
        launch();
    }

//============================================ START METHOD ================================================
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Form Login");

//================================================ GUI =================================================

        //Text
        Label sceneTitle = new Label("Selamat Datang");
        Label usernameLabel = new Label("Username");
        Label passwordLabel = new Label("password");
        Label wrongUsernameAndPassword = new Label("Username/Password Salah.");

        //Field
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();

        //Font Style
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        usernameLabel.setFont(Font.font("Calibri Body", FontWeight.NORMAL, 15));
        passwordLabel.setFont(Font.font("Calibri Body", FontWeight.NORMAL, 15));
        wrongUsernameAndPassword.setFont(Font.font("Calibri Body", FontWeight.NORMAL, 12));

        //Font Color
        wrongUsernameAndPassword.setStyle("-fx-text-fill: red;");

        //Button
        Button loginButton = new Button("Login");

        //Visible Settings
        wrongUsernameAndPassword.setVisible(false);

        //Posisi elemen.
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.add(sceneTitle, 0,0);

        grid.add(usernameLabel,0,1);
        grid.add(usernameField,1,1);

        grid.add(passwordLabel,0,2);
        grid.add(passwordField,1,2);

        grid.add(loginButton,1,3);

        grid.add(wrongUsernameAndPassword,0,4);

        grid.setVgap(10);
        grid.setHgap(5);

        //Create Window
        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

//================================================= Action ================================================
        //Action button LoginForm
        loginButton.setOnAction(event -> {

            if(usernameField.getText().equals(username) && passwordField.getText().equals(password)){

                //=================================== HOMEPAGE ========================================

                //Text
                Label successMessage = new Label("Login Berhasil!");
                Label text1 = new Label("Halo Naufal");

                //Font Style
                successMessage.setFont(Font.font("Tahoma", FontWeight.BOLD,20));
                text1.setFont(Font.font("Calibri Body", FontWeight.NORMAL, 15));

                //Button
                Button returnButtom = new Button("Kembali");

                //Element Position
                GridPane gridSuccessWindow = new GridPane();

                gridSuccessWindow.setAlignment(Pos.CENTER);
                gridSuccessWindow.add(successMessage, 0,0);
                gridSuccessWindow.add(text1, 0, 1);
                gridSuccessWindow.add(returnButtom, 0,2);

                gridSuccessWindow.setVgap(10);
                gridSuccessWindow.setHgap(5);

                //Create Window
                Scene successSceneWindow = new Scene(gridSuccessWindow, 400, 200);
                Stage successStage = new Stage();
                successStage.setTitle("Beranda");
                successStage.setScene(successSceneWindow);
                successStage.show();
                primaryStage.close();

                //Action Button Homepage
                returnButtom.setOnAction(event1 -> {
                    wrongUsernameAndPassword.setVisible(false);
                    usernameField.clear();
                    passwordField.clear();
                    primaryStage.show();
                    successStage.close();
                });

            }else{
                wrongUsernameAndPassword.setVisible(true);


            }
        });

    }

}
