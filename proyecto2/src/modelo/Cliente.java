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
public class Cliente extends Persona {
    private ArrayList<Venta> ventas;

    public Cliente(ArrayList<Venta> ventas, String nombre, int cedula) {
        super(nombre, cedula);
        this.ventas = ventas;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    @Override
    public String toString() {
        return "cliente: {" + "nombre=" + nombre + ", cedula=" + cedula +'}';
    }
}
