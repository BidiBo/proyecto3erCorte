/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.Zapato;

/**
 *
 * @author Yafeth
 */
public class MapaZapato implements IInventario {

    private Map<String, Zapato> mapa;

    public MapaZapato() {
        this.mapa = new HashMap<>();
    }
    
    public List<Zapato> informeRenta() {
        List<Zapato> lista = new ArrayList<>();
        for (Map.Entry<String, Zapato> entry : this.mapa.entrySet()) {
            lista.add(entry.getValue());
        }
        return lista;
    }
}
