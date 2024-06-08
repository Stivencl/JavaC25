package Clase11;

public class Rectangulo implements FiguraGeometrica{

    int largo;
    int ancho;

    Rectangulo(){
        this.ancho=5;
        this.largo=10;
    }
    @Override
    public int calcularAreacuadrada() {
        return ancho*largo;
    }
}
