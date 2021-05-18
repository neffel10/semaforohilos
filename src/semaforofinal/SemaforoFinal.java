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
public class SemaforoFinal extends Thread{

    public static JButton rojo;
    static JButton amarillo;
    static JButton verde;
    static JTextField texto;
    int contador=0,temp=0,temp2=0,temp3=0,temp4=0;
    
    public SemaforoFinal(JButton entrada1,JButton entrada2,JButton entrada3,JTextField entrada4){
        
       this.rojo=entrada1;
       this.amarillo=entrada2;
       this.verde=entrada3;
       this.texto=entrada4;
    
    }
    
    @Override
    public void run() {
         
        while(true){
            
            contador++;
             
            //pal rojo
            if(contador>=1 && contador<=30){
                temp++;
                texto.setText(""+temp);
            }
            if(contador==1){
                rojo.setBackground(Color.red);
                amarillo.setBackground(Color.gray);
                verde.setBackground(Color.gray);
            }
            
            //pal verde
            if(contador>=30 && contador<=55){
                temp2++;
                texto.setText(""+temp2);
            }
            if(contador==30){
              rojo.setBackground(Color.gray);
              amarillo.setBackground(Color.gray);
              verde.setBackground(Color.green);  
            }
            
            //pal amarillo
            if(contador>=55 && contador<60){
                temp3++;
                texto.setText(""+temp3);
            }
            if(contador==55){
              rojo.setBackground(Color.gray);
              amarillo.setBackground(Color.yellow);
              verde.setBackground(Color.gray);   
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
