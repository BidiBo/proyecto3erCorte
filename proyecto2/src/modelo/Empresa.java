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
public class Empresa {
 private String nombre;
private String Direccion;
 private ArrayList<CompraZapatos> comprasZapatos;
 private ArrayList<Detalle> detalles;

    public Empresa(String nombre, String direccion, ArrayList<Detalle> detalles, ArrayList<CompraZapatos> comprasZapatos) {
    this.nombre = nombre;
    this.Direccion = direccion;
    this.detalles = detalles;
    this.comprasZapatos = comprasZapatos;
}
  

    public double calcularGanancia() {
        double gananciaVentas = 0;
        double costoCompras = 0;

        // Calcular la ganancia total de las ventas
        for (Detalle detalle : detalles) {
            gananciaVentas += detalle.calcularGananciaTotal();
        }

        // Calcular el costo total de las compras de zapatos
        for (CompraZapatos compraZapatos : comprasZapatos) {
            costoCompras += compraZapatos.getCostoTotal();
        }

        // Calcular la ganancia de la empresa (ganancia de las ventas - costo de las compras)
        double gananciaEmpresa = gananciaVentas - costoCompras;

        return gananciaEmpresa;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<CompraZapatos> getComprasZapatos() {
        return comprasZapatos;
    }

    public void setComprasZapatos(ArrayList<CompraZapatos> comprasZapatos) {
        this.comprasZapatos = comprasZapatos;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<Detalle> detalles) {
        this.detalles = detalles;
    }
 
}
