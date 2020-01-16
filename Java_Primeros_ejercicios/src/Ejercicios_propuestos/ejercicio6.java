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
 *  Lee un número por teclado e indica si es divisible entre 2 
 * (resto = 0). Si no lo es, también debemos indicarlo.
 */
public class ejercicio6 {
    public static void main(String[] args) {
        int a;//variable del primer numero
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        if(a%2==0){
            System.out.println("El numero "+a+" es divisible entre dos");
        }else{
            System.out.println("El numero "+a+" no es divisilbe entre dos");
        }
    }
}
