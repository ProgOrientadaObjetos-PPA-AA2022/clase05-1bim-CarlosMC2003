/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import java.util.Scanner;
/**
 *
 * @author Carlos Morocho - PC
 */
public class EjecutorDos {
    public static void main(String[] aargs) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el Barrio en el que reside: ");
        String barrio = sc.nextLine();
        Barrio ba1 = new Barrio(barrio);
        
       System.out.print("Ingrese el Nombre de la Persona: ");
       String nombre = sc.nextLine();
       System.out.print("Ingrese la cedula de la Persona: ");
       String cedula = sc.nextLine();
       
       Persona p1 = new Persona (nombre, cedula, ba1);
       
       System.out.printf("%s", p1);
    }
}
