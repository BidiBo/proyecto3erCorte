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
public class CompraZapatos {
    private int NumZapatosMes;
    private int precio;
    private ArrayList<Zapato> zapatos;
    private ArrayList<Proveedor> proveedores;

    public CompraZapatos(int NumZapatosMes, int precio, ArrayList<Zapato>  zapatos, ArrayList<Proveedor> proveedores) {
        this.NumZapatosMes = NumZapatosMes;
        this.precio = precio;
        this.zapatos = zapatos;
        this.proveedores = proveedores;
    }
    public double getCostoTotal() {
        double costoTotal = 0.0;

        // Calcular el costo total sumando el costo de cada zapato
        for (Zapato zapato : zapatos) {
            costoTotal += zapato.getCosto();
        }

        return costoTotal;
    }
    public int getNumZapatosMes() {
        return NumZapatosMes;
    }

    public void setNumZapatosMes(int NumZapatosMes) {
        this.NumZapatosMes = NumZapatosMes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Zapato>  getZapatos() {
        return zapatos;
    }

    public void setZapatos(ArrayList<Zapato>  zapatos) {
        this.zapatos = zapatos;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
    public static double calcularPrecioTotal(ArrayList<CompraZapatos> comprasZapatos) {
        double precioTotal =0;
        for (CompraZapatos compraZapatos : comprasZapatos) {
            precioTotal += compraZapatos.getPrecio();
        }
        return precioTotal;
        
        
    }
    
    @Override
    public String toString() {
        return "Compra de zapatos:{" + "Numero de zapatos="+ NumZapatosMes + ", Precio=" + precio+ ", Informacion de los zapatos=" + zapatos+ ", Informacion del proveedor=" + proveedores +'}';
    }
}
