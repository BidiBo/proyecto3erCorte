/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;


import modelo.Zapato;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import modelo.*;
/**
 *
 * @author leoda
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Producto producto1 = new Producto(3874435, 0,"nikke","deportivo","azul",42, 10000);
Producto producto2 = new Producto(3874435, 0,"adidas","deportivo","rojo",40, 10000);
Producto producto3 = new Producto(3934215, 0,"church's","clasico","marron",45, 10000);

Venta venta1 = new Venta("2023/01/25",35000, new ArrayList<>(Arrays.asList(producto1)),1 );
Venta venta2 = new Venta("2023/01/26",10000, new ArrayList<>(Arrays.asList(producto2)),1);
Venta venta3 = new Venta("2023/01/27",73000, new ArrayList<>(Arrays.asList(producto3)),1);

Cliente cliente1= new Cliente(new ArrayList<>(Arrays.asList(venta1)),"Carlos Gutierres",1045643);
Cliente cliente2= new Cliente(new ArrayList<>(Arrays.asList(venta2)),"Maria Gomez",1055643);
Cliente cliente3= new Cliente(new ArrayList<>(Arrays.asList(venta3)),"Daniel Correa",1065643);


   

// Creamos tres detalles con estas ventas y una información adicional
Detalle detalle1 = new Detalle(new ArrayList<>(Arrays.asList(venta1)),new ArrayList<>(Arrays.asList(cliente1)));
Detalle detalle2 = new Detalle(new ArrayList<>(Arrays.asList(venta2)),new ArrayList<>(Arrays.asList(cliente2)));
Detalle detalle3 = new Detalle(new ArrayList<>(Arrays.asList(venta3)),new ArrayList<>(Arrays.asList(cliente3)));
  
Zapato zapato1 = new Zapato("nikke","deportivo","azul",42, 10000);
Zapato zapato2  = new Zapato("adidas","deportivo","rojo",40, 10000);
Zapato zapato3  = new Zapato("church's","clasico","marron",45, 10000);

FabricaDeZapatos fabricaDeZapatos1=new FabricaDeZapatos("Fabrica 1",1000,new ArrayList<>(Arrays.asList(zapato1)));
FabricaDeZapatos fabricaDeZapatos2=new FabricaDeZapatos("Fabrica 2",1000,new ArrayList<>(Arrays.asList(zapato2)));
FabricaDeZapatos fabricaDeZapatos3=new FabricaDeZapatos("Fabrica 3",1000,new ArrayList<>(Arrays.asList(zapato3)));
 
Proveedor proveedor1=new Proveedor(new ArrayList<>(Arrays.asList(fabricaDeZapatos1)),"Carlos Maestre",2839494 );
Proveedor proveedor2=new Proveedor(new ArrayList<>(Arrays.asList(fabricaDeZapatos2)),"Diego Alarcon",2839493 );
Proveedor proveedor3=new Proveedor(new ArrayList<>(Arrays.asList(fabricaDeZapatos3)),"Gabriel Olivella",2839492 );

  CompraZapatos compraZapatos1 = new CompraZapatos(70, 1260000,new ArrayList<>(Arrays.asList(zapato1)),new ArrayList<>(Arrays.asList(proveedor1)));
  CompraZapatos compraZapatos2 = new CompraZapatos(75, 1650000,new ArrayList<>(Arrays.asList(zapato1)),new ArrayList<>(Arrays.asList(proveedor2)));
  CompraZapatos compraZapatos3 = new CompraZapatos(73, 1460000,new ArrayList<>(Arrays.asList(zapato1)),new ArrayList<>(Arrays.asList(proveedor3)));
    
  
  System.out.println(compraZapatos1);
  System.out.println(compraZapatos2);
  System.out.println(compraZapatos3);
  
   System.out.println(detalle1);
   System.out.println(detalle2);
   System.out.println(detalle3);
   
   
    
    
   
  Empresa empresa = new Empresa("Nombre de la empresa", "Dirección de la empresa",
                new ArrayList<>(Arrays.asList(detalle1, detalle2, detalle3)),
                new ArrayList<>(Arrays.asList(compraZapatos1, compraZapatos2, compraZapatos3)));



double gananciaTotal = empresa.calcularGanancia();
System.out.println("*****GANANCIAS TOTALES DE LA EMPRESA*****");
System.out.println("Ganancia de la empresa: $" + gananciaTotal);

if (gananciaTotal < 0) {
     System.out.println("*****!!MALAS NOTICIAS!!*****");
    System.out.println("La empresa ha tenido pérdidas.");
    
}else if (gananciaTotal > 0) {
     System.out.println("*****¡¡¡ENHORABUENA¡¡¡*****");
    System.out.println("La empresa ha tenido ganancias.");
    
}
   
  } 
}    


    
