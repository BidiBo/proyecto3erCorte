/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author leoda
 */
public class Detalle {
    private ArrayList<Venta> ventas;
    private ArrayList<Cliente> Clientes;
    

    public Detalle(ArrayList<Venta> ventas, ArrayList<Cliente> Clientes) {
        this.ventas = ventas;
        this.Clientes = Clientes;
        
    }

public void agregarVentas(Venta venta) {
        this.ventas.add(venta);
    }
 
 public void agregarClientes(Cliente cliente) {
        this.Clientes.add(cliente);
    }
 
 
 
 
 
    public double calcularGananciaTotal() {
        double ventaTotal = 0.0;
        for (Venta venta : this.ventas) {
            ventaTotal += venta.getVentaTotal();
        }
        return ventaTotal;
    }
    

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }

    
    @Override
    public String toString() {
        return "Detalle: " + ventas + Clientes +'}';
    }
}
