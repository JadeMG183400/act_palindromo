package ejemplotabla;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practicaPalindromo extends JFrame implements ActionListener {

    private JButton botonV;
    private JTextField caja;
    private JLabel texto1;
    private JLabel texto2;
    private JLabel texto3;
    private JLabel texto4;
    private JLabel confirmacion;
    private JLabel longitud;
    private JLabel inversa;
    private JLabel repetidas;
   
      public practicaPalindromo(){
        super();
        configurarVentana();
        crearComponentes();
    }
    
     private void  configurarVentana(){
        this.setTitle("Palíndromo");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
     
     private void crearComponentes(){
     
        caja = new JTextField();
        caja.setBounds(80, 40, 130, 30);
        this.add(caja);
        
        botonV = new JButton();
        botonV.setText("Verificar");
        botonV.setBounds(90, 100, 100, 20);
        botonV.addActionListener(this);
        this.add(botonV);
        
        texto1 = new JLabel();
        texto1.setText("Longitud:");
        texto1.setBounds(40, 200, 100, 30);
        this.add(texto1);
        
        longitud = new JLabel();
        longitud.setBounds(120, 200, 100, 30);
        this.add(longitud);
        
        texto2 = new JLabel();
        texto2.setText("Palíndromo:");
        texto2.setBounds(40, 150, 100, 30);
        this.add(texto2);
        
        confirmacion = new JLabel();
        confirmacion.setBounds(120, 150, 100, 30);
        this.add(confirmacion);
        
        texto3 = new JLabel();
        texto3.setText("Inversa:");
        texto3.setBounds(40, 250, 100, 30);
        this.add(texto3);
        
        inversa = new JLabel();
        inversa.setBounds(120, 250, 100, 30);
        this.add(inversa);
        
        texto4 = new JLabel();
        texto4.setText("Repetidas:");
        texto4.setBounds(40, 300, 100, 30);
        this.add(texto4);
        
        repetidas = new JLabel();
        repetidas.setBounds(120, 300, 100, 30);
        this.add(repetidas);
        
        }
     
     public void actionPerformed(ActionEvent e){
         String palabra = caja.getText();
         String cantidad;
         String palabraInversa = "";
         char[] letrasPalabra;
         char[] letrasPalabraInversa;
         int contador = 0;
         
         letrasPalabra = palabra.toCharArray();
         
         if(e.getSource()== botonV){
             cantidad = String.valueOf(palabra.length());
             longitud.setText(cantidad);
         for(int i = palabra.length()-1; i>=0; i--){
             palabraInversa += Character.toString(palabra.charAt(i));
            }
         letrasPalabraInversa = palabraInversa.toCharArray();
         inversa.setText(palabraInversa);
             
         if(palabra.equals(palabraInversa)){
             confirmacion.setText("Sí");
            }
         else{
             confirmacion.setText("No");
            }
         for(int i=0; i<palabra.length(); i++ ){
             if(letrasPalabra[i] == letrasPalabraInversa[i]){
                 contador++;
             }
         }
         
         String resultado = String.valueOf(contador);
         repetidas.setText(resultado); 
     }
    }
     
    public static void main(String[] args) {
         practicaPalindromo ventana = new practicaPalindromo();
        ventana.setVisible(true);
    }
}
