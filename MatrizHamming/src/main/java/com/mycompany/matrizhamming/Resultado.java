package com.mycompany.matrizhamming;

import javax.swing.*;
import java.awt.event.AWTEventListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resultado extends JFrame implements ActionListener {
    private JLabel resultado1, resultado2;
    private JTextField campo1, campo2, campoResultado;
    private JButton calcular;
    String datosRes1 = "", datosRes2 = "";
    
    public Resultado(){
    setLayout(null);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    MatrizHamming datosPrincipal = new MatrizHamming();
    
  
    
    resultado1 = new JLabel("Resultado 1");
    resultado1.setBounds(40,170,150,35);
    add(resultado1);
    
    campo1 = new JTextField(datosRes1);
    campo1.setBounds(120,170,150,35);
    campo1.setText(datosRes1);
    add(campo1);
    
    resultado2 = new JLabel("Resultado 2");
    resultado2.setBounds(40,230,150,35);
    add(resultado2);
    
    campo2 = new JTextField();
    campo2.setBounds(120,230,150,35);
    campo2.setText(datosRes2);
    add(campo2);
    
    campoResultado = new JTextField();
    campoResultado.setBounds(40,270,300,35);
    add(campoResultado);
    
    calcular = new JButton("calcular");
    calcular.setBounds(150,320,120,30);
    add(calcular);
    calcular.addActionListener(this);
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
            
        }

    public static void main(String args[]) {
        Resultado ventana = new Resultado();
        ventana.setBounds(0,0,400,600);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }



}
