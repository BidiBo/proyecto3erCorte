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
public class Venta {
        private String fecha;
        private double precio;
        private ArrayList<Producto> productos;
        private int cantidadVendida;

    public Venta(String fecha, double precio, ArrayList<Producto> productos, int cantidadVendida) {
        this.fecha = fecha;
        this.precio = precio;
        this.productos = productos;
        this.cantidadVendida = cantidadVendida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

  
        
        public double getVentaTotal() {
        return this.precio * this.cantidadVendida;
    }
        
        @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", precio total=" + precio + ", Producto vendido=" + productos +", cantidad del producto=" + cantidadVendida+'}';
    }
}
