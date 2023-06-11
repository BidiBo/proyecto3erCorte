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
public class Proveedor extends Persona {
    private ArrayList<FabricaDeZapatos> fabricas;

    public Proveedor(ArrayList<FabricaDeZapatos> fabricas, String nombre, int cedula) {
        super(nombre, cedula);
        this.fabricas = fabricas;
    }

    public ArrayList<FabricaDeZapatos> getFabricas() {
        return fabricas;
    }

    public void setFabricas(ArrayList<FabricaDeZapatos> fabricas) {
        this.fabricas = fabricas;
    }
    @Override
    public String toString() {
        return "Proveedor{"+ " nombre=" + nombre + ", cedula=" + cedula+ ", Informacion de la Fabrica=" + "Fabrica=" + fabricas  +'}';
    }
}
