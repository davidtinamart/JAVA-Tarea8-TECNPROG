package org.example.Ejercicio2;

public class Libro extends Obra {
    private int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return "Libro " + getTitulo() + " de " + getAutor() + " (" + getNumPaginas() + " páginas)";
    }
}
