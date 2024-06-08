package Clase11;

public class Cuadrado implements FiguraGeometrica{
    int lado;

    Cuadrado(){
        this.lado=3;
    }

    @Override
    public int calcularAreacuadrada() {
        DiasSemana diasSemana = DiasSemana.Lunes;
        return lado*lado;
    }
}
