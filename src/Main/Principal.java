/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Enumeracion.Colores;
import Enumeracion.Dias;
import Enumeracion.Continentes;
import java.util.Scanner;

/**
 *
 * @author Martín
 */

public class Principal {
    
    
    static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
      
       
       // System.out.print("¿Cual es el dia de hoy?");
        //String hoy = ent.nextLine().toUpperCase();
       
        //imprimir(hoy);
        
         Continentes cont[] = Continentes.values();
         
         for(Continentes c: cont){
             System.out.print(c +" "+ c.cantidadPais());
             System.out.println();
         }

         
         Colores color[] = Colores.values();
         
         for(Colores c: color){
             System.out.println("Color: "+ c +" "+" Intensidad: "+ c.getIntensidad()+" Luminosidad: "+c.getLuminosidad()+" Matiz: "+ c.getMatiz());
         }

         
         
     }
     
     
     public static void imprimir(String hoy){
         Dias day = Dias.valueOf(hoy);//creo la variable Day tipo Dias y convierto el string hoy a un valor de tipo Dias
         
         switch(day){
                case LUNES:
                    System.out.println("Hoy es Lunes");
                     break;
                case MARTES:
                    System.out.println("Hoy es Martes");
                     break;
                case MIERCOLES:
                    System.out.println("Hoy es Miercoles");
                     break;
                case JUEVES:
                    System.out.println("Hoy es Jueves");
                     break;
                case VIERNES:
                    System.out.println("Hoy es Viernes");
                     break;
                case SABADO:
                    System.out.println("Hoy es Sabado");
                     break;
                case DOMINGO:
                    System.out.println("Hoy es Domingo");
                     break;
         }
 
         }
     
}
