package org.example.Ejercicio1;
import org.example.Ejercicio1.JugadorGuerra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        System.out.println("¿Nombre del jugador?");
        String nombre1 = teclado1.nextLine();
        System.out.println("¿Nombre del jugador?");
        String nombre2 = teclado2.nextLine();

        JugadorGuerra jugador1 = new JugadorGuerra(10, nombre1);
        JugadorGuerra jugador2 = new JugadorGuerra(10, nombre2);

        while (jugador1.getNumeroFichas() > 0 && jugador2.getNumeroFichas() > 0) {
            int tiradaJugador1 = jugador1.tirarDado();
            System.out.println("El jugador " + jugador1.getNombre() + " ha sacado un " + tiradaJugador1);
            int tiradaJugador2 = jugador2.tirarDado();
            System.out.println("El jugador " + jugador2.getNombre() + " ha sacado un " + tiradaJugador2);

            if (tiradaJugador1 > tiradaJugador2) {
                jugador2.restarFichas(1);
                System.out.println("El jugador " + jugador1.getNombre() + " ha ganado la tirada!");
                jugador1.sumarFichas(1);
                System.out.println("El jugador " + jugador1.getNombre() + " ha ganado una ficha!");
                System.out.println("---------------------------------------------------------------");
            } else if (tiradaJugador2 > tiradaJugador1) {
                jugador1.restarFichas(1);
                System.out.println("El jugador " + jugador2.getNombre() + " ha ganado la tirada!");
                jugador2.sumarFichas(1);
                System.out.println("El jugador " + jugador2.getNombre() + " ha ganado una ficha!");
                System.out.println("---------------------------------------------------------------");
            }
        }

        if (jugador1.getNumeroFichas() > 0) {
            System.out.println("El jugador " + jugador1.getNombre() + " ha ganado!");
        } else {
            System.out.println("El jugador " + jugador2.getNombre() + " ha ganado!");
        }
    }
}