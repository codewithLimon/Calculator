package com.example.masud;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CalculController extends Decimal implements Initializable {

    @FXML
    private Button binary;

    @FXML
    private Button clear;

    @FXML
    private Button exit;

    @FXML
    private Button hexad;

    @FXML
    private TextField input;

    @FXML
    private Label message;

    @FXML
    private Button next;

    @FXML
    private Button octal;

    @FXML
    void NextClicked(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("nextPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Base Conversion Calculator");
    }

    int decimalNumber;
    String binaryNumber;
    @FXML
    void binaryButtonClicked(ActionEvent event) {
        OriginalDecimal=input.getText();
        try{
            decimalNumber=Integer.parseInt(OriginalDecimal);
            binaryNumber=String.format("%8s", Integer.toBinaryString(decimalNumber)).replace(' ', '0');
            message.setText(binaryNumber);
        }catch (NumberFormatException e){
            try{
                double doubleValue = Double.parseDouble(input.getText());
                message.setText("No input given");
            }catch (NumberFormatException e2){
                message.setText("Not a number");
            }
        }

    }

    @FXML
    void clearClicked(ActionEvent event) {
        input.setText(null);
        message.setText("No input");
    }

    @FXML
    void exitClicked(ActionEvent event) {
        Platform.exit();
    }
    String hexaDecimalNumber;

    @FXML
    void hexaDecimalClicked(ActionEvent event) {
        OriginalDecimal=input.getText();
        try{
            decimalNumber=Integer.parseInt(OriginalDecimal);
            hexaDecimalNumber = Integer.toHexString(decimalNumber);
            message.setText(hexaDecimalNumber);
        }catch (NumberFormatException e){
            try{
                double doubleValue = Double.parseDouble(input.getText());
                message.setText("No input given");
            }catch (NumberFormatException e2){
                message.setText("Not a number");
            }
        }
    }

    String OctalNumber;
    @FXML
    void octalClicked(ActionEvent event) {
        OriginalDecimal=input.getText();
        try{
            decimalNumber=Integer.parseInt(OriginalDecimal);
            OctalNumber = Integer.toOctalString(decimalNumber);
            message.setText(OctalNumber);
        }catch (NumberFormatException e){
            try{
                double doubleValue = Double.parseDouble(input.getText());
                message.setText("No input given");
            }catch (NumberFormatException e2){
                message.setText("Not a number");
            }
        }
    }

    public void binaryConversion(){

    }

    public void checkInput(String s){

    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        message.setText("No input");
    }
}
