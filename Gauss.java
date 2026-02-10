import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Gauss extends JFrame implements ActionListener,ItemListener{

 private JButton boton1,boton2;
 private JTextField text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15;
 private JLabel label1,label2,label3,labelx,labely,labelz;
 private JCheckBox check1,check2,check3,check4;
 private JComboBox combo1;

 float tex1,tex2,tex3,tex4,tex5,tex6,tex7,tex8,tex9,tex10,tex11,tex12,determinante,x1,y1,z1,num1,num2,num3,resultado1,resultado2,
      auxiliar;
 String texto = "",texto1 = "",texto2 = "",texto3 = "",texto4 = "",texto5 = "",texto6 = "",texto7 = "",texto8 = "",texto9 = "",
        texto10 = "",texto11 = "",seleccion = "";
  float numeros [][] = new float[3][4];
  float numeros2 [][] = new float[2][3];
  float numeros3 [][] = new float[2][3];

    public Gauss(){
     setLayout(null);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     boton1 = new JButton("Calcular");
     boton1.setBounds(270,175,100,30);
     add(boton1);
     boton1.addActionListener(this);

     combo1 = new JComboBox();
     combo1.setBounds(10,215,100,30);
     add(combo1);
     combo1.addItem("");
     combo1.addItem("2 * 2");        
     combo1.addItem("3 * 3");
     combo1.addItemListener(this);

     boton2 = new JButton("Limpiar");
     boton2.setBounds(270,215,100,30);
     add(boton2);
     boton2.addActionListener(this);
      
     text1 = new JTextField();
     text1.setBounds(10,30,50,40);
     add(text1);

     text2 = new JTextField();
     text2.setBounds(10,80,50,40);
     add(text2);

     text3 = new JTextField();
     text3.setBounds(10,130,50,40);
     add(text3);

     text4 = new JTextField();
     text4.setBounds(70,30,50,40);
     add(text4);

     text5 = new JTextField();
     text5.setBounds(70,80,50,40);
     add(text5);

     text6 = new JTextField();
     text6.setBounds(70,130,50,40);
     add(text6);

     text7 = new JTextField();
     text7.setBounds(130,30,50,40);
     add(text7);

     text8 = new JTextField();
     text8.setBounds(130,80,50,40);
     add(text8);

     text9 = new JTextField();
     text9.setBounds(130,130,50,40);
     add(text9);

     label1 = new JLabel("=");
     label1.setBounds(190,30,50,40);
     add(label1);

     label2 = new JLabel("=");
     label2.setBounds(190,80,50,40);
     add(label2);

     label3 = new JLabel("=");
     label3.setBounds(190,130,50,40);
     add(label3);

     text10 = new JTextField();
     text10.setBounds(210,30,50,40);
     add(text10);

     text11 = new JTextField();
     text11.setBounds(210,80,50,40);
     add(text11);

     text12 = new JTextField();
     text12.setBounds(210,130,50,40);
     add(text12);

     labelx = new JLabel("X");
     labelx.setBounds(270,30,100,40);
     add(labelx);

     labely = new JLabel("Y");
     labely.setBounds(270,80,100,40);
     add(labely);

     labelz = new JLabel("Z");
     labelz.setBounds(270,130,100,40);
     add(labelz);

     text13 = new JTextField();
     text13.setBounds(280,30,100,40);
     add(text13);
     text13.setEditable(false);

     text14 = new JTextField();
     text14.setBounds(280,80,100,40);
     add(text14);
     text14.setEditable(false);


     text15 = new JTextField();
     text15.setBounds(280,130,100,40);
     add(text15);
     text15.setEditable(false);

 }
    
   public void itemStateChanged(ItemEvent e){

        if(e.getSource() == combo1){
             seleccion = combo1.getSelectedItem().toString();
               if(seleccion.equals("2 * 2")){
                    text1.setText("");
                    text2.setText("");
                    text4.setText("");
                    text5.setText("");
                    text10.setText(""); 
                    text11.setText("");
 
                    text3.setText("0");
                    text6.setText("0");
                    text7.setText("0");
                    text8.setText("0");
                    text9.setText("0");
                    text12.setText("0");                      
 
                    text3.setEnabled(false);                  
                    text6.setEnabled(false);
                    text7.setEnabled(false);
                    text8.setEnabled(false);
                    text9.setEnabled(false);
                    text12.setEnabled(false);
          
                    text3.setVisible(false);                  
                    text6.setVisible(false);
                    text7.setVisible(false);
                    text8.setVisible(false);
                    text9.setVisible(false);
                    text12.setVisible(false);
                    text15.setVisible(false);
                    
                    labelz.setVisible(false);
                    label3.setVisible(false);                   
            
               }else if(seleccion.equals("3 * 3")){                                
  
                    text3.setEnabled(true);                  
                    text6.setEnabled(true);
                    text7.setEnabled(true);
                    text8.setEnabled(true);
                    text9.setEnabled(true);
                    text12.setEnabled(true);

                    text1.setText("");
                    text2.setText("");
                    text3.setText("");
                    text4.setText("");
                    text5.setText("");
                    text6.setText("");
                    text7.setText("");
                    text8.setText("");
                    text9.setText("");
                    text10.setText("");
                    text11.setText("");
                    text12.setText("");
                    text13.setText("");
                    text14.setText("");
                    text15.setText("");

                    text3.setVisible(true);                  
                    text6.setVisible(true);
                    text7.setVisible(true);
                    text8.setVisible(true);
                    text9.setVisible(true);
                    text12.setVisible(true);
                    text15.setVisible(true);

                    labelz.setVisible(true);
                    label3.setVisible(true);      
               }

        }

 }


   public void actionPerformed(ActionEvent e){

       if(e.getSource() == boton1){
             texto = text1.getText();
            tex1 = Float.parseFloat(text1.getText());
            texto1 = text2.getText();
            tex2 = Float.parseFloat(text2.getText());
            texto2 = text3.getText();
            tex3 = Float.parseFloat(text3.getText());
           
            texto3 = text4.getText();
            tex4 = Float.parseFloat(text4.getText());
            texto4 = text5.getText();
            tex5 = Float.parseFloat(text5.getText());
            texto5 = text6.getText();
            tex6 = Float.parseFloat(text6.getText()); 

            texto6 = text7.getText();
            tex7 = Float.parseFloat(text7.getText());
            texto7 = text8.getText();
            tex8 = Float.parseFloat(text8.getText());
            texto8 = text9.getText();
            tex9 = Float.parseFloat(text9.getText()); 
                   
            texto9 = text10.getText();
            tex10 = Float.parseFloat(text10.getText());
            texto10 = text11.getText();
            tex11 = Float.parseFloat(text11.getText());
            texto11 = text12.getText();
            tex12 = Float.parseFloat(text12.getText());

              if(text1.equals("") || text2.equals("") || text3.equals("") || text4.equals("") || text5.equals("") || text6.equals("") ||
                 text7.equals("") || text8.equals("") || text9.equals("") || text10.equals("") || text11.equals("") || text12.equals("")){

                 text13.setText("Llena Todos los datos");
              }else if(seleccion.equals("2 * 2")){
              
              float determinante = 0;
              float num1 = 0;
              float num2 = 0;
              float x1 = 0;
              float y1 = 0;
                             
              numeros3 [0][0] = tex1;
              numeros3 [0][1] = tex4;
              numeros3 [0][2] = tex10;
              numeros3 [1][0] = tex2;
              numeros3 [1][1] = tex5;
              numeros3 [1][2] = tex11;

              num1 = numeros3[0][0] * numeros3[1][1];
              num2 = numeros3[1][0] * numeros3[0][1];
              resultado1 = num1 - num2;
              determinante = resultado1;              
              num1 = 0;
              num2 = 0;
              resultado1 = 0;
                   
              num1 = numeros3[0][2] * numeros3[1][1];
              num2 = numeros3[1][2] * numeros3[0][1];              
              resultado1 = num1 - num2;
              x1 = resultado1/determinante;
              text13.setText("" + x1);
              num1 = 0;
              num2 = 0;
              resultado1 = 0;

               num1 = numeros3[0][0] * numeros3[1][2];
               num2 = numeros3[1][0] * numeros3[0][2];              
               resultado1 = num1 - num2;
               y1 = resultado1/determinante;
               text14.setText("" + y1);


              }else if(seleccion.equals("3 * 3")){
                
              numeros [0][0] = tex1;
              numeros [0][1] = tex4;
              numeros [0][2] = tex7;
              numeros [0][3] = tex10;
              numeros [1][0] = tex2;
              numeros [1][1] = tex5;
              numeros [1][2] = tex8;
              numeros [1][3] = tex11;
              numeros [2][0] = tex3;
              numeros [2][1] = tex6;
              numeros [2][2] = tex9;
              numeros [2][3] = tex12;
        
              numeros2 [0][0] = tex1;
              numeros2 [0][1] = tex4;
              numeros2 [0][2] = tex7;
              numeros2 [1][0] = tex2;
              numeros2 [1][1] = tex5;
              numeros2 [1][2] = tex8;

             num1 = numeros[0][0] * numeros[1][1] * numeros[2][2];
             num2 = numeros[1][0] * numeros[2][1] * numeros2[0][2];
             num3 = numeros[2][0] * numeros2[0][1] * numeros2[1][2];

             resultado1 = num1 + num2 + num3;
             num1 = 0;
             num2 = 0;
             num3 = 0;
               
             num1 = numeros[0][2] * numeros[1][1] * numeros[2][0];
             num2 = numeros[1][2] * numeros[2][1] * numeros2[0][0];
             num3 = numeros[2][2] * numeros2[0][1] * numeros2[1][0];

             resultado2 = num1 + num2 + num3; 

             determinante = resultado1 - resultado2;
             num1 = 0;
             num2 = 0;
             num3 = 0;
             resultado1 = 0;
             resultado2 = 0;
        
              numeros [0][0] = numeros [0][3];
              numeros [0][1] = tex4;
              numeros [0][2] = tex7;
              numeros [0][3] = tex10;
              numeros [1][0] = numeros [1][3];
              numeros [1][1] = tex5;
              numeros [1][2] = tex8;
              numeros [1][3] = tex11;
              numeros [2][0] = numeros [2][3];
              numeros [2][1] = tex6;
              numeros [2][2] = tex9;
              numeros [2][3] = tex12;
        
              numeros2 [0][0] = numeros [0][3];
              numeros2 [0][1] = tex4;
              numeros2 [0][2] = tex7;
              numeros2 [1][0] = numeros [1][3];
              numeros2 [1][1] = tex5;
              numeros2 [1][2] = tex8;

              num1 = numeros[0][0] * numeros[1][1] * numeros[2][2];
             num2 = numeros[1][0] * numeros[2][1] * numeros2[0][2];
             num3 = numeros[2][0] * numeros2[0][1] * numeros2[1][2];

             resultado1 = num1 + num2 + num3;
             num1 = 0;
             num2 = 0;
             num3 = 0;
               
             num1 = numeros[0][2] * numeros[1][1] * numeros[2][0];
             num2 = numeros[1][2] * numeros[2][1] * numeros2[0][0];
             num3 = numeros[2][2] * numeros2[0][1] * numeros2[1][0];

             resultado2 = num1 + num2 + num3; 

             x1 = resultado1 - resultado2;
             x1 = x1/determinante;
             text13.setText("" + x1);
             num1 = 0;
             num2 = 0;
             num3 = 0;
             resultado1 = 0;
             resultado2 = 0;

              numeros [0][0] = tex1;
              numeros [0][1] = numeros [0][3];
              numeros [0][2] = tex7;
              numeros [0][3] = tex10;
              numeros [1][0] = tex2;
              numeros [1][1] = numeros [1][3];
              numeros [1][2] = tex8;
              numeros [1][3] = tex11;
              numeros [2][0] = tex3;
              numeros [2][1] = numeros [2][3];
              numeros [2][2] = tex9;
              numeros [2][3] = tex12;
        
              numeros2 [0][0] = tex1;
              numeros2 [0][1] = numeros [0][3];
              numeros2 [0][2] = tex7;
              numeros2 [1][0] = tex2;
              numeros2 [1][1] = numeros [1][3];
              numeros2 [1][2] = tex8;

             num1 = numeros[0][0] * numeros[1][1] * numeros[2][2];
             num2 = numeros[1][0] * numeros[2][1] * numeros2[0][2];
             num3 = numeros[2][0] * numeros2[0][1] * numeros2[1][2];

             resultado1 = num1 + num2 + num3;
             num1 = 0;
             num2 = 0;
             num3 = 0;
               
             num1 = numeros[0][2] * numeros[1][1] * numeros[2][0];
             num2 = numeros[1][2] * numeros[2][1] * numeros2[0][0];
             num3 = numeros[2][2] * numeros2[0][1] * numeros2[1][0];

             resultado2 = num1 + num2 + num3; 

             y1 = resultado1 - resultado2;
             y1 = y1/determinante;
             text14.setText("" + y1);
             num1 = 0;
             num2 = 0;
             num3 = 0;
             resultado1 = 0;
             resultado2 = 0;

              numeros [0][0] = tex1;
              numeros [0][1] = tex4;
              numeros [0][2] = numeros [0][3];
              numeros [0][3] = tex10;
              numeros [1][0] = tex2;
              numeros [1][1] = tex5;
              numeros [1][2] = numeros [1][3];
              numeros [1][3] = tex11;
              numeros [2][0] = tex3;
              numeros [2][1] = tex6;
              numeros [2][2] = numeros [2][3];
              numeros [2][3] = tex12;
        
              numeros2 [0][0] = tex1;
              numeros2 [0][1] = tex4;
              numeros2 [0][2] = numeros [0][3];
              numeros2 [1][0] = tex2;
              numeros2 [1][1] = tex5;
              numeros2 [1][2] = numeros [1][3];
 
             num1 = numeros[0][0] * numeros[1][1] * numeros[2][2];
             num2 = numeros[1][0] * numeros[2][1] * numeros2[0][2];
             num3 = numeros[2][0] * numeros2[0][1] * numeros2[1][2];

             resultado1 = num1 + num2 + num3;
             num1 = 0;
             num2 = 0;
             num3 = 0;
               
             num1 = numeros[0][2] * numeros[1][1] * numeros[2][0];
             num2 = numeros[1][2] * numeros[2][1] * numeros2[0][0];
             num3 = numeros[2][2] * numeros2[0][1] * numeros2[1][0];

             resultado2 = num1 + num2 + num3; 

             z1 = resultado1 - resultado2;
             z1 = z1/determinante;
             text15.setText("" + z1);
            }
            
       }

         if(e.getSource() == boton2){
                        
            text1.setText("");
            text2.setText("");
            text3.setText("");
            text4.setText("");
            text5.setText("");
            text6.setText("");
            text7.setText("");
            text8.setText("");
            text9.setText("");
            text10.setText("");
            text11.setText("");
            text12.setText("");
            text13.setText("");
            text14.setText("");
            text15.setText("");

            tex1 = 0;
            tex2 = 0;
            tex3 = 0;
            tex4 = 0;
            tex5 = 0;
            tex6 = 0;
            tex7 = 0;
            tex8 = 0;
            tex9 = 0;
            tex10 = 0;
            tex11 = 0;
            tex12 = 0;

            
         }
 
           
  }

  public static void main(String args[]){
     Gauss gauss1 = new Gauss();
     gauss1.setBounds(0,0,400,300);
     gauss1.setResizable(false);
     gauss1.setVisible(true);
     gauss1.setLocationRelativeTo(null);
 }
}