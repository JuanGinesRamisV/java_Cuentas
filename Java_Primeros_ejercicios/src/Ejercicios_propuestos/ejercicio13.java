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
 * Realiza una aplicación que nos pida un número de ventas a introducir, 
 * después nos pedirá tantas ventas por teclado como número de ventas
 * se hayan indicado. Al final mostrara la suma de todas las ventas. 
 * Piensa que es lo que se repite y lo que no.
 */
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int numeroVentas=0;
        double valorVenta=0;
        double totalCaja=0;
        System.out.println("Introduce el numero de ventas realizadas");
        numeroVentas=scanner.nextInt();
        for(i=0;i<numeroVentas;i++){
            valorVenta=0;
            System.out.println("Introduce el valor de la venta "+(i+1));
            valorVenta=scanner.nextDouble();
            totalCaja+=valorVenta;
        }
        System.out.println("El valor total de la caja es "+totalCaja);
    }
}
