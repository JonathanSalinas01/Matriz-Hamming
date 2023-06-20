package com.mycompany.matrizhamming;

import com.sun.source.tree.BreakTree;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class MatrizHamming extends JFrame implements ActionListener {
    private JLabel titulo, subtitulo, instrucciones, logo;
    private ImageIcon imagen;
    private JTextField num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12;
    private JTextField bi1, bi2, bi3, bi4, bi5, bi6, bi7, bi8, bi9, bi10, bi11, bi12;
    private JTextField n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12;
    private JTextField A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12;
    private JTextField B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12;
    private JTextField C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12;
    private JTextField D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11, D12;
    private JTextField campo1;
    private JButton calcular, agregarAresult1, agregarAresult2, verResult;
    private ButtonGroup selecParidad;
    private JRadioButton par, impar;
    
    public MatrizHamming(){
    setLayout(null);
    setTitle("Matriz de Hamming");
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
    imagen = new ImageIcon("C:\\Users\\jonat\\Documents\\NetBeansProjects\\MatrizHamming\\target\\classes\\com\\mycompany\\matrizhamming\\images\\itec3.png");
    
    logo = new JLabel(imagen);
    logo.setBounds(15,5,150,60);
    add(logo);
    
    titulo = new JLabel("Matriz de Hamming");
    titulo.setBounds(210,40,180,80);
    titulo.setFont(new Font("Andale Mono", 1, 20));
    add(titulo);
    
    subtitulo =  new JLabel("Arquitectura de Ordenadores Personales");
    subtitulo.setBounds(158,80,260,35);
    titulo.setFont(new Font("Andale Mono", 1, 16));
    add(subtitulo);
    
    num1 = new JTextField("1");
    num1.setBounds(20, 150,40,35);
    num1.setFont(new Font("Andale Mono", 1, 15));
    add(num1);
    
    num2 = new JTextField("2");
    num2.setBounds(60, 150,40,35);
    num2.setFont(new Font("Andale Mono", 1, 15));
    add(num2);
    
    num3 = new JTextField("3");
    num3.setBounds(100, 150,40,35);
    num3.setFont(new Font("Andale Mono", 1, 15));
    add(num3);
    
    num4 = new JTextField("4");
    num4.setBounds(140, 150,40,35);
    num4.setFont(new Font("Andale Mono", 1, 15));
    add(num4);
    
    num5 = new JTextField("5");
    num5.setBounds(180, 150,40,35);
    num5.setFont(new Font("Andale Mono", 1, 15));
    add(num5);
    
    num6 = new JTextField("6");
    num6.setBounds(220, 150,40,35);
    num6.setFont(new Font("Andale Mono", 1, 15));
    add(num6);
    
    num7 = new JTextField("7");
    num7.setBounds(260, 150,40,35);
    num7.setFont(new Font("Andale Mono", 1, 15));
    add(num7);
    
    num8 = new JTextField("8");
    num8.setBounds(300, 150,40,35);
    num8.setFont(new Font("Andale Mono", 1, 15));
    add(num8);
    
    num9 = new JTextField("9");
    num9.setBounds(340, 150,40,35);
    num9.setFont(new Font("Andale Mono", 1, 15));
    add(num9);
    
    num10 = new JTextField("10");
    num10.setBounds(380, 150,40,35);
    num10.setFont(new Font("Andale Mono", 1, 15));
    add(num10);
    
    num11 = new JTextField("11");
    num11.setBounds(420, 150,40,35);
    num11.setFont(new Font("Andale Mono", 1, 15));
    add(num11);
    
    num12 = new JTextField("12");
    num12.setBounds(460, 150,40,35);
    num12.setFont(new Font("Andale Mono", 1, 15));
    add(num12);
    
    //************************ Fin Fila 1 ***********************
    
    bi1 = new JTextField("0|0|0|1");
    bi1.setBounds(20, 185,40,35);
    bi1.setBackground(Color.yellow);
    add(bi1);
    
    bi2 = new JTextField("0|0|1|0");
    bi2.setBounds(60, 185,40,35);
    bi2.setBackground(Color.yellow);
    add(bi2);
    
    bi3 = new JTextField("0|0|1|1");
    bi3.setBounds(100, 185,40,35);
    bi3.setBackground(Color.yellow);
    add(bi3);
    
    bi4 = new JTextField("0|1|0|0");
    bi4.setBounds(140, 185,40,35);
    bi4.setBackground(Color.yellow);
    add(bi4);
    
    bi5 = new JTextField("0|1|0|1");
    bi5.setBounds(180, 185,40,35);
    bi5.setBackground(Color.yellow);
    add(bi5);
    
    bi6 = new JTextField("0|1|1|0");
    bi6.setBounds(220, 185,40,35);
    bi6.setBackground(Color.yellow);
    add(bi6);
    
    bi7 = new JTextField("0|1|1|1");
    bi7.setBounds(260, 185,40,35);
    bi7.setBackground(Color.yellow);
    add(bi7);
    
    bi8 = new JTextField("1|0|0|0");
    bi8.setBounds(300, 185,40,35);
    bi8.setBackground(Color.yellow);
    add(bi8);
    
    bi9 = new JTextField("1|0|0|1");
    bi9.setBounds(340, 185,40,35);
    bi9.setBackground(Color.yellow);
    add(bi9);
    
    bi10 = new JTextField("1|0|1|0");
    bi10.setBounds(380, 185,40,35);
    bi10.setBackground(Color.yellow);
    add(bi10);
    
    bi11 = new JTextField("1|0|1|1");
    bi11.setBounds(420, 185,40,35);
    bi11.setBackground(Color.yellow);
    add(bi11);
    
    bi12 = new JTextField("1|1|0|0");
    bi12.setBounds(460, 185,40,35);
    bi12.setBackground(Color.yellow);
    add(bi12);
    
    //************************* Fin Fila 2 **********************
    
    n1 = new JTextField();
    n1.setBounds(20, 215,40,35);
    n1.setBackground(Color.black);
    add(n1);
    
    n2 = new JTextField();
    n2.setBounds(60, 215,40,35);
    n2.setBackground(Color.black);
    add(n2);
    
    n3 = new JTextField();
    n3.setBounds(100, 215,40,35);
    n3.setFont(new Font("Andale Mono", 1, 15));
    n3.setBackground(Color.green);
    add(n3);
    
    n4 = new JTextField();
    n4.setBounds(140, 215,40,35);
    n4.setBackground(Color.black);
    add(n4);
    
    n5 = new JTextField();
    n5.setBounds(180, 215,40,35);
    n5.setFont(new Font("Andale Mono", 1, 15));
    n5.setBackground(Color.green);
    add(n5);
    
    n6 = new JTextField();
    n6.setBounds(220, 215,40,35);
    n6.setFont(new Font("Andale Mono", 1, 15));
    n6.setBackground(Color.green);
    add(n6);
    
    n7 = new JTextField();
    n7.setBounds(260, 215,40,35);
    n7.setFont(new Font("Andale Mono", 1, 15));
    n7.setBackground(Color.green);
    add(n7);
    
    n8 = new JTextField();
    n8.setBounds(300, 215,40,35);
    n8.setBackground(Color.black);
    add(n8);
    
    n9 = new JTextField();
    n9.setBounds(340, 215,40,35);
    n9.setFont(new Font("Andale Mono", 1, 15));
    n9.setBackground(Color.green);
    add(n9);
    
    n10 = new JTextField();
    n10.setBounds(380, 215,40,35);
    n10.setFont(new Font("Andale Mono", 1, 15));
    n10.setBackground(Color.green);
    add(n10);
    
    n11 = new JTextField();
    n11.setBounds(420, 215,40,35);
    n11.setFont(new Font("Andale Mono", 1, 15));
    n11.setBackground(Color.green);
    add(n11);
    
    n12 = new JTextField();
    n12.setBounds(460, 215,40,35);
    n12.setFont(new Font("Andale Mono", 1, 15));
    n12.setBackground(Color.green);
    add(n12);
    
    //*********************** Fin Fila 3 ***************************
    
    A1 = new JTextField();
    A1.setBounds(20, 250,40,35);
    A1.setFont(new Font("Andale Mono", 1, 15));
    A1.setBackground(Color.orange);
    add(A1);
    
    A2 = new JTextField();
    A2.setBounds(60, 250,40,35);
    A2.setBackground(Color.black);
    add(A2);
    
    A3 = new JTextField();
    A3.setBounds(100, 250,40,35);
    add(A3);
    
    A4 = new JTextField();
    A4.setBounds(140, 250,40,35);
    A4.setBackground(Color.black);
    add(A4);
    
    A5 = new JTextField();
    A5.setBounds(180, 250,40,35);
    add(A5);
    
    A6 = new JTextField();
    A6.setBounds(220, 250,40,35);
    add(A6);
    
    A7 = new JTextField();
    A7.setBounds(260, 250,40,35);
    add(A7);
    
    A8 = new JTextField();
    A8.setBounds(300, 250,40,35);
    A8.setBackground(Color.black);
    add(A8);
    
    A9 = new JTextField();
    A9.setBounds(340, 250,40,35);
    add(A9);
    
    A10 = new JTextField();
    A10.setBounds(380, 250,40,35);
    add(A10);
    
    A11 = new JTextField();
    A11.setBounds(420, 250,40,35);
    add(A11);
    
    A12 = new JTextField();
    A12.setBounds(460, 250,40,35);
    add(A12);
    
    //****************************** Fin Fila 4 **************************
    
    B1 = new JTextField();
    B1.setBounds(20, 285,40,35);
    B1.setBackground(Color.black);
    add(B1);
    
    B2 = new JTextField();
    B2.setBounds(60, 285,40,35);
    B2.setFont(new Font("Andale Mono", 1, 15));
    B2.setBackground(Color.orange);
    add(B2);
    
    B3 = new JTextField();
    B3.setBounds(100, 285,40,35);
    add(B3);
    
    B4 = new JTextField();
    B4.setBounds(140, 285,40,35);
    B4.setBackground(Color.black);
    add(B4);
    
    B5 = new JTextField();
    B5.setBounds(180, 285,40,35);
    add(B5);
    
    B6 = new JTextField();
    B6.setBounds(220, 285,40,35);
    add(B6);
    
    B7 = new JTextField();
    B7.setBounds(260, 285,40,35);
    add(B7);
    
    B8 = new JTextField();
    B8.setBounds(300, 285,40,35);
    B8.setBackground(Color.black);
    add(B8);
    
    B9 = new JTextField();
    B9.setBounds(340, 285,40,35);
    add(B9);
    
    B10 = new JTextField();
    B10.setBounds(380, 285,40,35);
    add(B10);
    
    B11 = new JTextField();
    B11.setBounds(420, 285,40,35);
    add(B11);
    
    B12 = new JTextField();
    B12.setBounds(460, 285,40,35);
    add(B12);
    
    //************************* Fin Fila 5 *****************
    
    C1 = new JTextField();
    C1.setBounds(20, 320,40,35);
    C1.setBackground(Color.black);
    add(C1);
    
    C2 = new JTextField();
    C2.setBounds(60, 320,40,35);
    C2.setBackground(Color.black);
    add(C2);
    
    C3 = new JTextField();
    C3.setBounds(100, 320,40,35);
    add(C3);
    
    C4 = new JTextField();
    C4.setBounds(140, 320,40,35);
    C4.setFont(new Font("Andale Mono", 1, 15));
    C4.setBackground(Color.orange);
    add(C4);
    
    C5 = new JTextField();
    C5.setBounds(180, 320,40,35);
    add(C5);
    
    C6 = new JTextField();
    C6.setBounds(220, 320,40,35);
    add(C6);
    
    C7 = new JTextField();
    C7.setBounds(260, 320,40,35);
    add(C7);
    
    C8 = new JTextField();
    C8.setBounds(300, 320,40,35);
    C8.setBackground(Color.black);
    add(C8);
    
    C9 = new JTextField();
    C9.setBounds(340, 320,40,35);
    add(C9);
    
    C10 = new JTextField();
    C10.setBounds(380, 320,40,35);
    add(C10);
    
    C11 = new JTextField();
    C11.setBounds(420, 320,40,35);
    add(C11);
    
    C12 = new JTextField();
    C12.setBounds(460, 320,40,35);
    add(C12);
    
    //***************************Fin Fila 6 *********************
    
    D1 = new JTextField();
    D1.setBounds(20, 355,40,35);
    D1.setBackground(Color.black);
    add(D1);
    
    D2 = new JTextField();
    D2.setBounds(60, 355,40,35);
    D2.setBackground(Color.black);
    add(D2);
    
    D3 = new JTextField();
    D3.setBounds(100, 355,40,35);
    add(D3);
    
    D4 = new JTextField();
    D4.setBounds(140, 355,40,35);
    D4.setBackground(Color.black);
    add(D4);
    
    D5 = new JTextField();
    D5.setBounds(180, 355,40,35);
    add(D5);
    
    D6 = new JTextField();
    D6.setBounds(220, 355,40,35);
    add(D6);
    
    D7 = new JTextField();
    D7.setBounds(260, 355,40,35);
    add(D7);
    
    D8 = new JTextField();
    D8.setBounds(300, 355,40,35);
    D8.setFont(new Font("Andale Mono", 1, 15));
    D8.setBackground(Color.orange);
    add(D8);
    
    D9 = new JTextField();
    D9.setBounds(340, 355,40,35);
    add(D9);
    
    D10 = new JTextField();
    D10.setBounds(380, 355,40,35);
    add(D10);
    
    D11 = new JTextField();
    D11.setBounds(420, 355,40,35);
    add(D11);
    
    D12 = new JTextField();
    D12.setBounds(460, 355,40,35);
    add(D12);
    
    //*********************** Fin Filas y Columnas **********************
    
    instrucciones = new JLabel("Ingrese el número binario");
    instrucciones.setBounds(210, 430, 300, 35);
    add(instrucciones);
    
    campo1 = new JTextField();
    campo1.setBounds(120,460,300,35);
    campo1.setFont(new Font("Andale Mono", 1, 15));
    add(campo1);
    
    JLabel paridad = new JLabel("Seleccione la paridad:");
    paridad.setBounds(210,500,200,35);
    add(paridad);
    
    selecParidad = new ButtonGroup();
    par = new JRadioButton("Paridad Par");
    par.setBounds(210,535,200,35);
    selecParidad.add(par);
    
    impar = new JRadioButton("Paridad Impar");
    impar.setBounds(210,565,200,35);
    selecParidad.add(impar);
    add(par);
    add(impar);
    
    calcular = new JButton("Calcular");
    calcular.setBounds(220,610,100,35);
    add(calcular);
    calcular.addActionListener(this);
    
    /*verResult = new JButton("Ver Resultados -->");
    verResult.setBounds(360,610,150,35);
    add(verResult);
    verResult.addActionListener(this);
    
    agregarAresult1 = new JButton("Agregar a resultado 1");
    agregarAresult1.setBounds(20,400,170,30);
    add(agregarAresult1);
    agregarAresult1.addActionListener(this);
    
    agregarAresult2 = new JButton("Agregar a resultado 2");
    agregarAresult2.setBounds(330,400,170,30);
    add(agregarAresult2);
    agregarAresult2.addActionListener(this);*/

    }
    
    
    String mensaje = "", guardarRes1 = "", guardarRes2 = "";
    int contador = 0;
    public void actionPerformed(ActionEvent e){
       
        if(e.getSource() == calcular){
            mensaje = campo1.getText();
            String[] almacenador = new String[8];
            String puntero = "";
            boolean bandera = false;
       
        while(bandera == false){
            if(mensaje.length() < 8 || mensaje.length() > 8){
                JOptionPane.showMessageDialog(null, "Error! El numero ingresado debe ser binario y tener 8 bits");
                campo1.setText(""); 
                break;
            }else{
                bandera = true;
            }
        }
       if(bandera){
       for(int i = 0; i < mensaje.length(); i++){
               
               
               if(mensaje.charAt(i) != '0' && mensaje.charAt(i) != '1'){
                   JOptionPane.showMessageDialog(null, "ERROR! Debe ingresar un número binario de 8 bits");
                   campo1.setText("");
                   break;
               }
               
            puntero = "" + mensaje.charAt(i);
            almacenador[i] = puntero;
               
           }
           n3.setText(almacenador[0]);
           n5.setText(almacenador[1]);
           n6.setText(almacenador[2]);
           n7.setText(almacenador[3]);
           n9.setText(almacenador[4]);
           n10.setText(almacenador[5]);
           n11.setText(almacenador[6]);
           n12.setText(almacenador[7]);
           
           String comprobador = n3.getText();
           
           if(comprobador.equals("1")){
               A3.setText("1");
               B3.setText("1");
               C3.setText("0");
               D3.setText("0");
           }else{
               A3.setText("0");
               B3.setText("0");
               C3.setText("0");
               D3.setText("0");
           }
           
        comprobador = n5.getText();
            if(comprobador.equals("1")){
               A5.setText("1");
               B5.setText("0");
               C5.setText("1");
               D5.setText("0");
           }else{
               A5.setText("0");
               B5.setText("0");
               C5.setText("0");
               D5.setText("0");
           }
            
        comprobador = n6.getText();
            if(comprobador.equals("1")){
               A6.setText("0");
               B6.setText("1");
               C6.setText("1");
               D6.setText("0");
           }else{
               A6.setText("0");
               B6.setText("0");
               C6.setText("0");
               D6.setText("0");
           }
            
        comprobador = n7.getText();
           if(comprobador.equals("1")){
               A7.setText("1");
               B7.setText("1");
               C7.setText("1");
               D7.setText("0");
           }else{
               A7.setText("0");
               B7.setText("0");
               C7.setText("0");
               D7.setText("0");
           }
           
        comprobador = n9.getText();
            if(comprobador.equals("1")){
               A9.setText("1");
               B9.setText("0");
               C9.setText("0");
               D9.setText("1");
           }else{
               A9.setText("0");
               B9.setText("0");
               C9.setText("0");
               D9.setText("0");
           }
        comprobador = n10.getText();
            if(comprobador.equals("1")){
               A10.setText("0");
               B10.setText("1");
               C10.setText("0");
               D10.setText("1");
           }else{
               A10.setText("0");
               B10.setText("0");
               C10.setText("0");
               D10.setText("0");
           }
            
        comprobador = n11.getText();
            if(comprobador.equals("1")){
               A11.setText("1");
               B11.setText("1");
               C11.setText("0");
               D11.setText("1");
           }else{
               A11.setText("0");
               B11.setText("0");
               C11.setText("0");
               D11.setText("0");
           }
            
        comprobador = n12.getText();
            if(comprobador.equals("1")){
               A12.setText("0");
               B12.setText("0");
               C12.setText("1");
               D12.setText("1");
           }else{
               A12.setText("0");
               B12.setText("0");
               C12.setText("0");
               D12.setText("0");
           }
       }
       int acumulador = 0;
      if(par.isSelected()){
        acumulador = Integer.parseInt(A3.getText()) + Integer.parseInt(A5.getText()) + Integer.parseInt(A6.getText()) + Integer.parseInt(A7.getText()) + Integer.parseInt(A9.getText()) + Integer.parseInt(A10.getText()) + Integer.parseInt(A11.getText()) + Integer.parseInt(A12.getText());
        if(acumulador % 2 == 0){
        A1.setText("0");
        }else{
        A1.setText("1");
        }
        
        acumulador = Integer.parseInt(B3.getText()) + Integer.parseInt(B5.getText()) + Integer.parseInt(B6.getText()) + Integer.parseInt(B7.getText()) + Integer.parseInt(B9.getText()) + Integer.parseInt(B10.getText()) + Integer.parseInt(B11.getText()) + Integer.parseInt(B12.getText());
        if(acumulador % 2 == 0){
        B2.setText("0");
        }else{
        B2.setText("1");
        }
        
        acumulador = Integer.parseInt(C3.getText()) + Integer.parseInt(C5.getText()) + Integer.parseInt(C6.getText()) + Integer.parseInt(C7.getText()) + Integer.parseInt(C9.getText()) + Integer.parseInt(C10.getText()) + Integer.parseInt(C11.getText()) + Integer.parseInt(C12.getText());
        if(acumulador % 2 == 0){
        C4.setText("0");
        }else{
        C4.setText("1");
        }
        
        acumulador = Integer.parseInt(D3.getText()) + Integer.parseInt(D5.getText()) + Integer.parseInt(D6.getText()) + Integer.parseInt(D7.getText()) + Integer.parseInt(D9.getText()) + Integer.parseInt(D10.getText()) + Integer.parseInt(D11.getText()) + Integer.parseInt(D12.getText());
        if(acumulador % 2 == 0){
        D8.setText("0");
        }else{
        D8.setText("1");
        }
        
      }
      if(impar.isSelected()){
        acumulador = Integer.parseInt(A3.getText()) + Integer.parseInt(A5.getText()) + Integer.parseInt(A6.getText()) + Integer.parseInt(A7.getText()) + Integer.parseInt(A9.getText()) + Integer.parseInt(A10.getText()) + Integer.parseInt(A11.getText()) + Integer.parseInt(A12.getText());
        if(acumulador % 2 == 0){
            A1.setText("1");
        }else{
            A1.setText("0");
        }
        
        acumulador = Integer.parseInt(B3.getText()) + Integer.parseInt(B5.getText()) + Integer.parseInt(B6.getText()) + Integer.parseInt(B7.getText()) + Integer.parseInt(B9.getText()) + Integer.parseInt(B10.getText()) + Integer.parseInt(B11.getText()) + Integer.parseInt(B12.getText());
        if(acumulador % 2 == 0){
            B2.setText("1");
        }else{
            B2.setText("0");
        }
        
        acumulador = Integer.parseInt(C3.getText()) + Integer.parseInt(C5.getText()) + Integer.parseInt(C6.getText()) + Integer.parseInt(C7.getText()) + Integer.parseInt(C9.getText()) + Integer.parseInt(C10.getText()) + Integer.parseInt(C11.getText()) + Integer.parseInt(C12.getText());
        if(acumulador % 2 == 0){
            C4.setText("1");
        }else{
            C4.setText("0");
        }
        
        acumulador = Integer.parseInt(D3.getText()) + Integer.parseInt(D5.getText()) + Integer.parseInt(D6.getText()) + Integer.parseInt(D7.getText()) + Integer.parseInt(D9.getText()) + Integer.parseInt(D10.getText()) + Integer.parseInt(D11.getText()) + Integer.parseInt(D12.getText());
        if(acumulador % 2 == 0){
            D8.setText("1");
        }else{
            D8.setText("0");
        }
        }
        }
      
        /*if(e.getSource() == agregarAresult1){
        guardarRes1 = A1.getText() + B2.getText() + C4.getText() + D8.getText();
        Resultado guard = new Resultado();
        guard.datosRes1 = guardarRes1;
        }
        
        if(e.getSource() == agregarAresult2){
        guardarRes2 = A1.getText() + B2.getText() + C4.getText() + D8.getText();
        }
        
        if(e.getSource() == verResult){
        Resultado verResultado = new Resultado();
        verResultado.setBounds(0,0,400,600);
        verResultado.setVisible(true);
        verResultado.setResizable(false);
        verResultado.setLocationRelativeTo(null);
        this.setVisible(false);
        }*/
       }
        
       
    
   

    public static void main(String[] args) {
        MatrizHamming ventana = new MatrizHamming();
        ventana.setBounds(0,0,530,700);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
