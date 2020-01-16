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
 * Declara dos variables numéricas 
 * (con el valor que desees), muestra por consola la suma, resta, 
 * multiplicación, división y módulo (resto de la división).
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a; //variable del primer numero
        int b; //variable del segundo numero
        System.out.println("Introduce un numero");
        a=scanner.nextInt();
        b=scanner.nextInt();
        //suma
        System.out.println("La suma de "+a+" y "+b+"es "+(a+b));
        //resta
        System.out.println("La resta de "+a+" y "+b+" es "+(a-b));
        //multipliacación
        System.out.println("La multiplicación de "+a+" y "+b+" es "+(a*b));
        //División
        System.out.println("La División de "+a+" y "+b+" es "+(a/b));
        //módulo
        System.out.println("El módulo de "+a+" y "+b+" es "+(a%b));
    }
}
