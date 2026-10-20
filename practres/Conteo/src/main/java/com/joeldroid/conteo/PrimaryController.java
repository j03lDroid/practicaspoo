package com.joeldroid.conteo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.application.Platform;

public class PrimaryController {
    @FXML TextField txtnum;
    @FXML Button btncontar;
    @FXML ProgressBar pb;
    @FXML Button btnesperar;
    private int numclics = 0;
    
    @FXML
    private void contar(){
        numclics++;
        txtnum.setText(String.valueOf(numclics));
    }
    
    @FXML
    private void esperar(){
        btnesperar.setDisable(true);
        pb.setProgress(0.0);
        
        Thread hesperar = new Thread(() ->{
            int tiemptotal = 10000;
            int pasos = 100;
            int tiempas = tiemptotal / pasos;
            
            for(int i = 1; i <= pasos; i++){
                try{
                    Thread.sleep(tiempas);
                }catch(InterruptedException e){
                    break;
                }
                double progreso = (double) i / pasos;
                Platform.runLater(() -> pb.setProgress(progreso));
            }
            Platform.runLater(() -> btnesperar.setDisable(false));
        });
        hesperar.setDaemon(true);
        hesperar.start();
    }
}
