package org.example.Ejercicio2;
import java.util.ArrayList;

public class Pedido {


        private Cliente cliente;
        private ArrayList<Obra> obras;

        public Pedido(Cliente cliente) {
            this.cliente = cliente;
            obras = new ArrayList<Obra>();
        }

        public void agregarObra(Obra obra) {
            obras.add(obra);
        }

        @Override
        public String toString() {
            String str = "Pedido de: " + cliente.getNombre() + ":\n\n";
            for (Obra obra : obras) {
                str += "    - " + obra.toString() + "\n";
            }
            return str;
        }
    }

