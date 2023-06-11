/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import modelo.Zapato;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Yafeth
 */
interface IInventario {
    
    public interface IRenta {
    
  
    List<Zapato> informe() throws IOException;
    
}
    
}
