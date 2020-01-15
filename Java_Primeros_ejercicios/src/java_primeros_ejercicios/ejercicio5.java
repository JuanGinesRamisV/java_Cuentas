/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_primeros_ejercicios;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class ejercicio5 {

            
 public static void main(String[] args) {
        int numeros[]= new int [10];
        int numeros1[]=new int [10];
        int numerosfinal[]=new int[20];
        Scanner scanner= new Scanner(System.in);
        int i;
        int aux=0;
        for(i=0;i<numeros.length;i++){
            numeros[i]=scanner.nextInt();
        }
        for(i=0;i<numeros1.length;i++){
            numeros1[i]=scanner.nextInt();
        }
        for(i=0;i<numerosfinal.length;i+=2){
            numerosfinal[i]=numeros[aux];
            aux++;
        }

        aux=0;
        for(i=1;i<numerosfinal.length;i+=2){
            numerosfinal[i]=numeros1[aux];
            aux++;
        }
        System.out.println("----------------");
        for(i=0;(i<numerosfinal.length);i++){
            System.out.println(numerosfinal[i]);
        }
    }
}
