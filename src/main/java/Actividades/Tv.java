package Actividades;

public class  Tv {

//Constructor
public Tv(String marca, String pantalla){
 this.marca = marca;
 this.pantalla = pantalla;
}
//Constructor

 public Tv(String marca, int tamano, String color, String pantalla) {
  this.marca = marca;
  this.tamano = tamano;
  this.color = color;
  this.pantalla = pantalla;
 }

 //Atributos de la clase
 private  String marca;
 private  int tamano;
 private  String color;
 private  String pantalla;

 //funciones de la clase

 public String getMarca(){
  return marca;
 }
 public String getPantalla(){
  return pantalla;
 }

}



