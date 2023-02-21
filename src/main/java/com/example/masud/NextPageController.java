package com.example.masud;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class NextPageController {

    @FXML
    private Button back;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void backClicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Base Conversion Calculator");
    }

}
