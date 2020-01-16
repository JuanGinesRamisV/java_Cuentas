/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_propuestos;

import java.util.Scanner;

/**
 *
 * @author juang
 *  Declara 2 variables numéricas (con el valor que desees), he indica cual es
 * mayor de los dos. Si son iguales indicarlo también. Ves cambiando los 
 * valores para comprobar que funciona.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a; //variable primer numero
        int b; //variable segundo numero
        System.out.println("Introduce el primer numero");
        a=scanner.nextInt();
        System.out.println("Introduce el segundo numero");
        b=scanner.nextInt();
        if(a>b){
            System.out.println("El numero "+a+" es mayor que "+b);
        }else if(a<b){
            System.out.println("El numero "+b+" es mayor que "+a);
        }else{
            System.out.println(a+" y "+b+" són el mismo numero");
        }
    }
}
