package com.joeldroid.entero;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class PrimaryController {

    @FXML private TextField txtnum;
    @FXML private TextField txtcan;
    @FXML private TextField txtim;
    @FXML private TextField txtpar;
    @FXML private TextField txttol;
    @FXML private TextField txtmay;
    @FXML private TextField txtmen;
    @FXML private ListView<Integer> listd;
    
    @FXML
    private void analizar(){
        String numstr = txtnum.getText();
        int numero = Integer.parseInt(numstr);
        int cantidad = numstr.length();
        int sumaimp = 0;
        int sumapar= 0;
        int total = 0;
        int cmay = -1;
        int cmen = 10;
        
        for (int i = 0; i < numstr.length(); i++){
            int digito = Character.getNumericValue(numstr.charAt(i));
            total += digito;
            if (digito % 2 == 0){
                sumapar += digito;
            }else{
                sumaimp += digito;
            }
            if (digito > cmay) cmay = digito;
            if (digito < cmen) cmen = digito;
            
            txtcan.setText(String.valueOf(cantidad));
            txtim.setText(String.valueOf(sumaimp));
            txtpar.setText(String.valueOf(sumapar));
            txttol.setText(String.valueOf(total));
            txtmay.setText(String.valueOf(cmay));
            txtmen.setText(String.valueOf(cmen));
            
            listd.getItems().clear();
            for (int a = 1; a <= numero; a++){
                if(numero % a == 0){
                    listd.getItems().add(a);
                }
            }
        }
    }
    
    @FXML
    private void limpiar(){
        txtnum.setText("");
        txtcan.setText("");
        txtim.setText("");
        txtpar.setText("");
        txttol.setText("");
        txtmay.setText("");
        txtmen.setText("");
        listd.getItems().clear();
    }
}
