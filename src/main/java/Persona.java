public class Persona {

    
     //Constructor
    private Persona(String id, char edad, char genero, String nombreCompleto, float altura) {
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.nombreCompleto = nombreCompleto;
        this.altura = altura;
    }


    private String id;
    private char edad;
    private char genero;
    private String nombreCompleto;
    private float altura;

   //Constructor
    public Persona(String nombreCompleto, char genero) {
        this.genero = genero;
        this.nombreCompleto = nombreCompleto;
    }


    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getEdad() {
        return edad;
    }

    public void setEdad(char edad) {
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }



}
