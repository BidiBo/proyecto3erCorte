/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Yafeth
 */


import java.util.ArrayList;
import modelo.Producto;

import java.util.List;
import vista.JDInforme;


public class LogicEmpresa {
    private List<Producto> zapatos;
    private JDInforme informe;

    public LogicEmpresa() {
        this.zapatos = new ArrayList<>();
        this.informe = new JDInforme();
    }

    public void agregarProducto(Producto zapato) {
        // Lógica para agregar un producto
        zapatos.add(zapato);
    }

    public void mostrarInforme() {
        // Imprime el informe en la consola
        System.out.println("Informe de Productos:");
        for (Producto zapato : zapatos) {
            System.out.println(zapato.toString());
        }
    }

    public void mostrarInformeEnVentana() {
       informe.mostrarInforme(zapatos);
    }
}
