package org.example.Ejercicio2;
import java.util.ArrayList;

public class Clientes {
        private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        public static void agregarCliente(Cliente cliente) {
            clientes.add(cliente);
        }

        public static ArrayList<Cliente> getClientes() {
            return clientes;
        }
    }
