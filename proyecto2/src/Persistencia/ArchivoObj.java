/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import modelo.Zapato;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Yafeth
 */
public class ArchivoObj {

  
    
    public class ArchivoObjetos implements IInventario {

    private File archivo;
    private FileInputStream aLectura;
    private FileOutputStream aEscritura;
    private ListaZapato list;

    public ArchivoObjetos() {
        this("inventario.obj");
    }

    public ArchivoObjetos(String name) {
        this.archivo = new File(name);
    }

   

    
    public List<Zapato> generarInforme() throws IOException {
        this.leerLista();
        return this.list.Informe();
    }


    private void leerLista() throws IOException {

        if (!this.archivo.exists()) {
            this.list = new ListaZapato();
        } else {
            ObjectInputStream ois = null;
            try {
                this.aLectura = new FileInputStream(this.archivo);
                ois = new ObjectInputStream(this.aLectura);
                this.list = (ListaZapato) ois.readObject();

            } catch (IOException ioe) {
                throw new IOException("El archivo no existe o no pudo ser leído");
            } catch (ClassNotFoundException ex) {
                throw new IOException("El formato del archivo no es correcto, no es una lista de zapatos");
            } finally {
                if (ois != null) {
                    ois.close();
                }
                if (this.aLectura != null) {
                    this.aLectura.close();
                }

            }
        }
    }
    }
    
}
