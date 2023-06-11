/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Logica.LogicEmpresa;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.Zapato;


/**
 *
 * @author Yafeth
 */


public class JDInforme extends JDialog {

    private Container contenedor;

    
    private JComboBox cmbTipo;

    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private String[] titulos = {""};
    private String[][] datosTabla = null;
    private LogicEmpresa logica;

    public JDInforme(JFrame owner, String title, boolean modal) {
        super(owner, title, modal);
        this.logica = new LogicEmpresa();
        this.initComponentes();
        this.setSize(900, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public JDInforme() {
        
    }

   

    private void initComponentes() {
        this.contenedor = this.getContentPane();
        this.setLayout(new BorderLayout());
        this.panelResultados();
    }

  

    private void panelResultados() {
        JScrollPane panel = new JScrollPane();

        this.tabla = new JTable();
        this.modeloTabla = new DefaultTableModel(this.datosTabla, this.titulos);
        this.tabla.setModel(this.modeloTabla);

        panel.setViewportView(this.tabla);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.contenedor.add(panel, BorderLayout.CENTER);

        this.loadTable();
    }
    
    
     public void loadTable() {
    Zapato[] zapatos = new Zapato[3]; 
    // Aquí asignas los datos por defecto a cada objeto Zapato
    zapatos[0] = new Zapato("nikke","deportivo","azul",42, 100000);
    zapatos[1] = new Zapato("adidas","deportivo","rojo",40, 10000);
    zapatos[2] = new Zapato("church's","clasico","marron",45, 10000);
    

    this.datosTabla = new String[zapatos.length][];
    for (int i = 0; i < zapatos.length; i++) {
        this.datosTabla[i] = zapatos[i].getDataForTable();
    }
    this.modeloTabla.setDataVector(this.datosTabla, this.titulos);
}
     
public void mostrarInforme(List<Producto> zapatos) {
        StringBuilder informe = new StringBuilder();
        informe.append("Informe de Zapatos:\n");
        for (Producto zapato : zapatos) {
            informe.append(zapato.toString()).append("\n");
        }
       
    }



   

    
}

