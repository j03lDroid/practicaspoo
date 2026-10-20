package com.joeldroid.carrera;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Carreracontroller {
    @FXML private ProgressBar pbLiebre;
    @FXML private ProgressBar pbTortuga;
    @FXML private Label lblestadoLiebre;
    @FXML private Label lblestadoTortuga;
    @FXML private Button btniniciar;
    
    @FXML
    private void coniniciarcarrera(){
        btniniciar.setDisable(true);
        pbLiebre.setProgress(0.0);
        pbTortuga.setProgress(0.0);
        
        Liebre liebre = new Liebre(pbLiebre, lblestadoLiebre);
        Tortuga tortuga = new Tortuga(pbTortuga, lblestadoTortuga);

        liebre.start();
        tortuga.start();
    }
}