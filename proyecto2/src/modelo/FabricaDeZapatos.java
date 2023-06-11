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
public class FabricaDeZapatos {
    private String nombre;
    private int numZapatosPorMes;
    private ArrayList<Zapato> zapatos;

    public FabricaDeZapatos(String nombre, int numZapatosPorMes, ArrayList<Zapato> zapatos) {
        this.nombre = nombre;
        this.numZapatosPorMes = numZapatosPorMes;
        this.zapatos = zapatos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumZapatosPorMes() {
        return numZapatosPorMes;
    }

    public void setNumZapatosPorMes(int numZapatosPorMes) {
        this.numZapatosPorMes = numZapatosPorMes;
    }

    public ArrayList<Zapato> getZapatos() {
        return zapatos;
    }

    public void setZapatos(ArrayList<Zapato> zapatos) {
        this.zapatos = zapatos;
    }
    
    @Override
    public String toString() {
        return "Fabrica{" + "nombre=" + nombre + ", numero de zapatos por mes=" + numZapatosPorMes +'}';
    }
}
