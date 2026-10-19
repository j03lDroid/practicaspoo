package figuritas;

public class Figuritas {

    public static void SOUT(String mensaje) {
        System.out.println(mensaje);
    }
    public static void main(String[] args){
    Figura2D f = new TrianguloRect(3,4);
    SOUT(f.imprimeFigura());
    f = new Circulo(3);
    SOUT(f.imprimeFigura());
    }
}