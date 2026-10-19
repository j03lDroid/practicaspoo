package figuritas;

import java.util.Locale;

public class TrianguloRect extends FiguraRecta{
    public TrianguloRect(int alto, int ancho){
        super(alto, ancho);
    }
    
    @Override
    public double calcularArea(){
        return(alto * ancho) / 2;
    }
    
    @Override
    public double calcularPerimetro(){
        double hipotenusa = Math.sqrt((alto * alto) + (ancho * ancho));
        return alto + ancho + hipotenusa;
    }
    
    @Override
    public String imprimeFigura(){
        return String.format(
        Locale.US,
        "Se imprime un Triangulo con alto: %d, ancho: %d. area: %.2f, perimetro: %.2f ",
        alto, ancho, calcularArea(), calcularPerimetro());
    }
}