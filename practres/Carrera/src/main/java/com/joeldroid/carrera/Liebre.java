package com.joeldroid.carrera;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Liebre extends Corredor{
    public Liebre(ProgressBar pb, Label lblestado){
        super("La Liebre", pb, lblestado);
    }
    
    @Override
    public void run(){
        double progreso = 0.0;
        while (progreso < 0.4){
            progreso += 0.05;
            actualizar(progreso, "¡Está corriendo!");
            try{
                Thread.sleep(150);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        actualizar(progreso, "¡Se durmió!");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        while(progreso < 1.0){
            progreso += 0.05;
            actualizar(progreso, "!Despertó y está corriendo!");
            try{
                Thread.sleep(150);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        actualizar(1.0, "¡Llegó a la metá");
    }
}