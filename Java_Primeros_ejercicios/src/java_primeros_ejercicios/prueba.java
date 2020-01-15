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
public class prueba {
    public static void main(String[] args) {
        int i;
        int numeros[] = new int[12];
        int numeros1[] = new int[12];
        int numerosFinal[] = new int[numeros.length*2];
        int aux;
        Scanner scanner = new Scanner (System.in);
        for(i=0;i<numeros.length;i++){
            numeros[i] = scanner.nextInt();
        }
        for(i=0;i<numeros1.length;i++){
            numeros1[i]=scanner.nextInt();
        }
        for(i=0;i<numeros.length;i+=3){
            aux=i+1;
            System.out.println(i);
            System.out.println(aux);
            aux++;
            System.out.println(aux);

        }
    }
}
