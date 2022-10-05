/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Enumeracion.Dias;
import java.util.Scanner;

/**
 *
 * @author Martín
 */

public class Principal {
    
    
    static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
      
       
        System.out.print("¿Cual es el dia de hoy?");
        String hoy = ent.nextLine().toUpperCase();
         
            imprimir(hoy);

        

         
         
     }
     
     
     public static void imprimir(String hoy){
         Dias day = Dias.valueOf(hoy);
         
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
