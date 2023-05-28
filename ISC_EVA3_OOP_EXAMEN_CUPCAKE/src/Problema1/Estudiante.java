package Problema1;


import java.io.Serializable;

public class Estudiante implements Serializable {

    //Declaración de los atributos de la clase
    private String nombre;
    private int numero;
    private String grado;

    public Estudiante(String nombre, int numero, String grado) {
        this.nombre = nombre;
        this.numero = numero;
        this.grado = grado;
    }

    public Estudiante() {
        nombre = "";
        numero = 0;
        grado = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

}