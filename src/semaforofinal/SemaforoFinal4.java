/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforofinal;

import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author ALE
 */
public class SemaforoFinal4 extends Thread{

    JButton rojo4;
    JButton amarillo4;
    JButton verde4;
    JTextField texto4;
    int contador=0,temp=0,temp2=0,temp3=0,temp4=0;
    
    public SemaforoFinal4(JButton entrada1,JButton entrada2,JButton entrada3,JTextField entrada4){
        
       this.rojo4=entrada1;
       this.amarillo4=entrada2;
       this.verde4=entrada3;
       this.texto4=entrada4;
    
    }
    
        @Override
    public void run() {
         
        while(true){
            
            contador++;
             
            //pal rojo
            if(contador>=1 && contador<=30){
                temp++;
                texto4.setText(""+temp);
            }
            if(contador==1){
                rojo4.setBackground(Color.red);
                amarillo4.setBackground(Color.gray);
                verde4.setBackground(Color.gray);
            }
            
            //pal verde
            if(contador>=30 && contador<=55){
                temp2++;
                texto4.setText(""+temp2);
            }
            if(contador==30){
              rojo4.setBackground(Color.gray);
              amarillo4.setBackground(Color.gray);
              verde4.setBackground(Color.green);  
            }
            
            //pal amarillo
            if(contador>=55 && contador<60){
                temp3++;
                texto4.setText(""+temp3);
            }
            if(contador==55){
              rojo4.setBackground(Color.gray);
              amarillo4.setBackground(Color.yellow);
              verde4.setBackground(Color.gray);   
            }            
            
            if(contador==59){
                contador=0;
                temp=0;
                temp2=0;
                temp3=0;
                temp4=0;
            }
            
          try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
            }
        }
        
    }
    
    /*public void start() {
        new Thread(this).start();
    }  */
    
    
   /* public static void main(String[] args) {
        
    }*/
    
    
}
