package com.joeldroid.carrera;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public abstract class Corredor extends Thread{
    protected ProgressBar pb;
    protected Label lblestado;
    protected String nombre;
    
    public Corredor(String nombre, ProgressBar pb, Label lblestado){
        this.nombre = nombre;
        this.pb = pb;
        this.lblestado = lblestado;
    }    
    protected void actualizar(double progreso, String estado){
        Platform.runLater(()->{
            pb.setProgress(progreso);
            lblestado.setText(nombre + ": " + estado);
        }); 
    }
}