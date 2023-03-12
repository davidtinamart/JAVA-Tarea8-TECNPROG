package org.example.Ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Obra> obras = new ArrayList<Obra>();
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-- Menú --");
            System.out.println("1 - Mostrar clientes");
            System.out.println("2 - Crear clientes");
            System.out.println("3 - Crear una obra");
            System.out.println("4 - Crear un pedido");
            System.out.println("5 - Mostrar pedidos");
            System.out.println("6 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("-- Clientes --");
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("Cliente n°." + (i + 1) + ": " + clientes.get(i).getNombre());
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("\n¿Nombre? ");
                    String nombre = scanner.nextLine();
                    clientes.add(new Cliente(nombre));
                    System.out.println("Cliente " + nombre + " añadido\n");

                    break;
                case 3:
                    System.out.println("\n¿Tipo?");
                    System.out.println("1 - Libro");
                    System.out.println("2 - Vídeo");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\n¿Título? ");
                    String titulo = scanner.nextLine();
                    System.out.print("\n¿Autor? ");
                    String autor = scanner.nextLine();
                    switch (tipo) {
                        case 1:
                            System.out.print("\n¿Número de páginas? ");
                            int paginas = scanner.nextInt();
                            scanner.nextLine();
                            obras.add(new Libro(titulo, autor, paginas));
                            System.out.println("Libro " + titulo + " de " + autor + " (" + paginas + " páginas) añadido\n");
                            break;

                        case 4:
                            System.out.println("\n-- Clientes --");
                            for (int i = 0; i < clientes.size(); i++) {
                                System.out.println("Cliente n°." + (i + 1) + ": " + clientes.get(i).getNombre());
                            }
                            break;

                        case 5:
                            System.out.println("-- Pedidos --");
                            for (int i = 0; i < pedidos.size(); i++) {
                                System.out.println(pedidos.get(i).toString());
                            }
                            break;

                        case 6:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción no valida, prueba otra vez.");
                    }

        }
        }
        while (opcion != 6) ;
        scanner.close();
    }
}





