package org.example.Ejercicio2;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        pedidos = new ArrayList<Pedido>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    @Override
    public String toString() {
        return "Cliente n°." + (Clientes.getClientes().indexOf(this) + 1) + ": " + nombre;
    }
}