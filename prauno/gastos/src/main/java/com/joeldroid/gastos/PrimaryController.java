package com.joeldroid.gastos;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtalim;
    @FXML private TextField txtre;
    @FXML private TextField txttrans;
    @FXML private TextField txttel;
    @FXML private TextField txto;
    @FXML private TextField txttol;
    @FXML private TextField txtgal;
    
    @FXML
    private void calcular(){
        int alimentacion = Integer.parseInt(txtalim.getText());
        int refrigerio = Integer.parseInt(txtre.getText());
        int transporte = Integer.parseInt(txttrans.getText());
        int telefonia = Integer.parseInt(txttel.getText());
        int otros = Integer.parseInt(txto.getText());
        int total = alimentacion + refrigerio + transporte + telefonia + otros;
        txttol.setText(String.valueOf(total));
        
        int max = alimentacion;
        String categoriamax = "Alimentación";
        
        if (refrigerio>max){
            max = refrigerio;
            categoriamax = "Refrigerios";
        }
        if (transporte>max){
            max = transporte;
            categoriamax = "Transporte";
        }
        if (telefonia>max){
            max = telefonia;
            categoriamax = "Telefonía";
        }
        if (otros>max){
            max = otros;
            categoriamax = "Otros";
        }
        txtgal.setText(categoriamax);
    }
    
    @FXML
    private void limpiar(){
        txtalim.setText("");
        txtre.setText("");
        txttrans.setText("");
        txttel.setText("");
        txto.setText("");
        txttol.setText("");
        txtgal.setText("");
    }
}