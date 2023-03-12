package org.example.Ejercicio1;
import java.util.Random;

public class Dado {
    private Random random;

    public Dado() {
        random = new Random();
    }

    public int tirar() {
        return random.nextInt(6) + 1;
    }
}
