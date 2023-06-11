/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;


/**
 *
 * @author Yafeth
 */

import modelo.Zapato;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Archivtexto implements IInventario {

    private File archivo;
    private FileWriter aEscritura;
    private Scanner aLectura;

    public Archivtexto() {
        this("Inventario.dat");
    }

    public Archivtexto(String name) {
        this.archivo = new File(name);
    }

    public void registrarZapato(Zapato zapato) throws IOException {

        try {
            this.aEscritura = new FileWriter(this.archivo, true);
            PrintWriter pw = new PrintWriter(this.aEscritura);
            pw.println(Arrays.toString(zapato.getDataForTable()));
            pw.close();
        } catch (IOException ioe) {
            throw new IOException("El archivo no existe o no pudo ser creado para escritura");
        } finally {
            if (this.aEscritura != null) {
                this.aEscritura.close();
            }
        }

    }

    private Zapato cargarDatos(String data[]) {
    String marca = data[0];
    String modelo = data[1];
    String color = data[2];
    int talla = Integer.parseInt(data[3]);
    double costo = Double.parseDouble(data[4]);
    

    return new Zapato(marca, modelo, color,talla,costo);
}

  

    public List<Zapato> generarInforme() throws IOException {
        List<Zapato> inventario = new ArrayList<>();
        try {
            this.aLectura = new Scanner(this.archivo);
            while (this.aLectura.hasNext()) {
                String datos[] = this.aLectura.nextLine().split(";");
                Zapato zapato = this.cargarDatos(datos);
                inventario.add(zapato);
            }
            return inventario;
        } catch (FileNotFoundException fne) {
            throw new IOException("El archivo de lectura no existe o no es posible abrirlo");
        } finally {
            if (this.aLectura != null) {
                this.aLectura.close();
            }
        }
    }
}
    

