package figuritas;

import java.util.Locale;

public class Circulo extends Figuracircular {
    public Circulo (int radio){
        super(radio);
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
    
    @Override
    public String imprimeFigura(){
        return String.format(
        Locale.US,
        "Se imprime un Circulo con radio: %d, area: %.2f, perimetro: %.2f", 
        radio, calcularArea(), calcularPerimetro());
    }
}