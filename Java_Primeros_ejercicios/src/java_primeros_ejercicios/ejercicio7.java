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
public class ejercicio7 {

    public static void ejercicio1() {
        int numeros[] = new int[5];
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce 5 numeros");
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("has introducido los numeors en el siguiente orden");
        for (i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "");
        }
    }

    public static void ejercicio2() {
        int numeros[] = new int[5];
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce 5 numeros");
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("has introducido los numeors en el siguiente orden");
        System.out.println("hola");
        for (i = 4; i >= 0; i = i - 1) {
            System.out.println(numeros[i]);
        }
    }

    public static void ejercicio3() {
        int numeros_positivos = 0;
        int numeros_negativos = 0;
        int numero_ceros = 0;
        int positivos = 0;
        int negativos = 0;
        int numeros[] = new int[5];
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce 5 numeros por pantlla");
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                numeros_positivos++;
                positivos += numeros[i];
            } else if (numeros[i] < 0) {
                numeros_negativos++;
                negativos += numeros[i];
            } else {
                numero_ceros++;
            }
        }
        System.out.println("------");
        if (numeros_positivos > 0) {
            System.out.println("La media de los numeros positivos es" + positivos
                    / numeros_positivos);
        }
        if (0 < numeros_negativos) {
            System.out.println("La media de los numeros negativos es" + negativos
                    / numeros_negativos);
        }
        if (numero_ceros == 0) {
            System.out.println("No se hay ningun cero");
        } else {
            System.out.println("Hay " + numero_ceros + " ceros");
        }
    }

    public static void ejercicio4() {
        int numeros[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("Introduce 10 numeros");
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("-----------");
        int j = numeros.length - 1;
        for (i = 0; i < (numeros.length) / 2; i++) {
            System.out.println(numeros[i]);
            System.out.println(numeros[j]);
            j = j - 1;
        }
    }

    public static void ejercicio5() {
        int numeros[] = new int[10];
        int numeros1[] = new int[10];
        int numerosfinal[] = new int[20];
        Scanner scanner = new Scanner(System.in);
        int i;
        int aux = 0;
        System.out.println("Introduce los 10 primeros numeros");
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Introduce otros 10 numeros");
        for (i = 0; i < numeros1.length; i++) {
            numeros1[i] = scanner.nextInt();
        }
        for (i = 0; i < numerosfinal.length; i += 2) {
            numerosfinal[i] = numeros[aux];
            aux++;
        }

        aux = 0;
        for (i = 1; i < numerosfinal.length; i += 2) {
            numerosfinal[i] = numeros1[aux];
            aux++;
        }
        System.out.println("----------------");
        for (i = 0; (i < numerosfinal.length); i++) {
            System.out.println(numerosfinal[i]);
        }
    }

    public static void ejercicio6() {
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

    public static void main(String[] args) {
        boolean aux = false;
        Scanner scanner= new Scanner(System.in);
        int opcion;
        while (aux == false) {
            System.out.println("-----------------");
            System.out.println("| 1)Ejercicio 1 |");
            System.out.println("| 2)Ejercicio 2 |");
            System.out.println("| 3)Ejercicio 3 |");
            System.out.println("| 4)Ejercicio 4 |");
            System.out.println("| 5)Ejercicio 5 |");
            System.out.println("| 6)Ejercicio 6 |");
            System.out.println("| 7)Salir       |");
            System.out.println("-----------------");
            System.out.println("");
            System.out.println("Elige una opción");
            opcion=scanner.nextInt();
            switch(opcion){
                case 1:
                    ejercicio1();
                    System.out.println("");
                    break;
                case 2:
                    ejercicio2();
                    System.out.println("");
                    break;
                case 3:
                    ejercicio3();
                    System.out.println("");
                    break;
                case 4:
                    ejercicio4();
                    System.out.println("");
                    break;
                case 5:
                    ejercicio5();
                    System.out.println("");
                    break;
                case 6:
                    ejercicio6();
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Adiós!!!!");
                    aux = true;
            }

        }
    }
}
