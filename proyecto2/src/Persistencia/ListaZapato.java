/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import modelo.Zapato;

/**
 *
 * @author Yafeth
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import modelo.Zapato;

public class ListaZapato implements IInventario, Serializable {

    private List<Zapato> lista;

    public ListaZapato() {
        this.lista = new ArrayList<>();
    }
    
    public List<Zapato> Informe() {
        return this.lista;
    }
}














    

