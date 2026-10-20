package com.joeldroid.carrera;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Tortuga extends Corredor{
    public Tortuga(ProgressBar pb, Label lblestado){
        super("La Tortuga", pb, lblestado);
    }
    
    @Override
    public void run(){
        double progreso = 0.0;
        while(progreso < 1.0){
            progreso += 0.02;
            if(progreso >1.0) progreso = 1.0;
            actualizar(progreso, "¡Está corriendo!");
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            actualizar(1.0, "¡Llegó a la meta!");
        }
    }
}