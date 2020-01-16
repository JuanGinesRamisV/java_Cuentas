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
 *Modifica el ejercicio anterior, para que en lugar de pedir un número,
 * pida un carácter (char) y muestre su código en la tabla ASCII.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un caracter");
        char caracter = sc.next().charAt(0);
        int numero= (int)caracter;
        System.out.println(numero);
    }
}
