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
public class SemaforoFinal3 extends Thread{

    public static JButton rojo3;
    static JButton amarillo3;
    static JButton verde3;
    static JTextField texto3;
    int contador=0,temp=0,temp2=0,temp3=0,temp4=0;
    
    public SemaforoFinal3(JButton entrada1,JButton entrada2,JButton entrada3,JTextField entrada4){
        
       this.rojo3=entrada1;
       this.amarillo3=entrada2;
       this.verde3=entrada3;
       this.texto3=entrada4;
    
    }
    
    @Override
    public void run() {
         
        while(true){
            
            contador++;
             
            //pal verde
            if(contador>=1 && contador<=25){
                temp++;
                texto3.setText(""+temp);
            }
            if(contador==1){
                rojo3.setBackground(Color.gray);
                amarillo3.setBackground(Color.gray);
                verde3.setBackground(Color.green);
            }
            
            //pal amarillo
            if(contador>=25 && contador<=30){
                temp2++;
                texto3.setText(""+temp2);
            }
            if(contador==25){
              rojo3.setBackground(Color.gray);
              amarillo3.setBackground(Color.yellow);
              verde3.setBackground(Color.gray);  
            }
            
            //pal rojo
            if(contador>=30 && contador<60){
                temp3++;
                texto3.setText(""+temp3);
            }
            if(contador==30){
              rojo3.setBackground(Color.red);
              amarillo3.setBackground(Color.gray);
              verde3.setBackground(Color.gray);   
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
    
    //public void start() {
        //new Thread(this).start();
    //}  
    
    
   /* public static void main(String[] args) {
        
    }*/
    
    
}
