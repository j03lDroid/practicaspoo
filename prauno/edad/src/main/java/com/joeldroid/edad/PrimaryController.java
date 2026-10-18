package com.joeldroid.edad;

import javafx.fxml.FXML;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML TextField txtfecha;
    @FXML Label lblres;
    
    @FXML
    private void calcular(){
        String textofecha = txtfecha.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(textofecha, formatter);
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fecha, fechaActual);
        int anios = periodo.getYears();
        int meses = periodo.getMonths();

        lblres.setText("Tiene " + anios + " años con " + meses + " meses");
    }
    
    @FXML
    private void limpiar(){
        txtfecha.setText("");
        lblres.setText("");
    }
}
