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
public class Java_Primeros_ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[]= new int[5];
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce 5 numeros");
        for(i=0;i<numeros.length;i++){
            numeros[i]=scanner.nextInt();
        }
        System.out.println("has introducido los numeors en el siguiente orden");
        for(i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+ "");
        }
        
    }
    
}
