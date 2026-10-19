package test;

public class Alumno extends Persona {
    public Alumno(){
        super();
        System.out.println("Se crea un Alumno...");
    }
    
    @Override
    public String toString(){
        return "Un alumno llamado: " + this.nombre;
    }
}
