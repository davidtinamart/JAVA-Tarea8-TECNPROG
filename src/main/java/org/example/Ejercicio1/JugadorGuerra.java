package org.example.Ejercicio1;
import org.example.Ejercicio1.Dado;


public class JugadorGuerra {

    private int numeroFichas;
    private Dado dado;
    private String nombre;

    public JugadorGuerra(int numeroFichas, String nombre) {
        this.numeroFichas = numeroFichas;
        this.nombre = nombre;
        this.dado = new Dado();
    }

    public int getNumeroFichas() {
        return numeroFichas;
    }

    public void setNumeroFichas(int numeroFichas) {
        this.numeroFichas = numeroFichas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int tirarDado() {
        return dado.tirar();
    }

    public void restarFichas(int cantidad) {
        numeroFichas -= cantidad;
    }

    public void sumarFichas(int cantidad) {
        numeroFichas += cantidad;
    }
}