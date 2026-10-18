package com.joeldroid.multiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class PrimaryController {
    @FXML private TextField txtnum;
    @FXML private ListView listmult;
    
    @FXML
    private void calcular(){
        listmult.getItems().clear();
        int numero = Integer.parseInt(txtnum.getText());
        for (int i = 1; i <= 10; i++){
            String fila = numero + "X" + i + "=" + (numero * i);
            listmult.getItems().add(fila);
        }
    }
    @FXML 
    private void limpiar(){
        txtnum.setText("");
        listmult.getItems().clear();
    }
}
