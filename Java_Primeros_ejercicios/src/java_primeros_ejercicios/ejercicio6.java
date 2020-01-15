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
public class ejercicio6 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[] = new int[12];
        int numeros1[] = new int[12];
        int listafinal[] = new int[24];
        int i;
        int aux = 0;
        int auxlista = 0;
        int auxlista1 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce los elementos de la primera lista");
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("introduce los elementos de la segunda lista");
        for (i = 0; i < numeros1.length; i++) {
            numeros1[i] = scanner.nextInt();
        }
        //for para añadir los elementos a la lista final//
        for (i = 0; i < listafinal.length; i += 3) {
            if (i % 2 == 0) {
                aux = i;
                listafinal[i] = numeros[auxlista];
                listafinal[aux += 1] = numeros[auxlista += 1];
                listafinal[aux += 1] = numeros[auxlista += 1];
            } else if (i % 2 != 0) {
                aux = i;
                listafinal[i] = numeros1[auxlista1];
                listafinal[aux += 1] = numeros1[auxlista1 += 1];
                listafinal[aux += 1] = numeros1[auxlista1 += 1];
            }
        }
        System.out.println("----------------");
        for (i = 0; i < listafinal.length; i++) {
            System.out.println(listafinal[i]);
        }

    }
}
