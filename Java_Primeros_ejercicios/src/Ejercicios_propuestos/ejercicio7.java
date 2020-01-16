/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_propuestos;

import java.util.Scanner;

/**
 *Lee un número por teclado y muestra por consola, el carácter al 
 * que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, 
 * me muestre una a.
 * @author juang
 */
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inroduce un numero:");
        int numero = scanner.nextInt();
        char caracter = (char) numero;
        System.out.println(caracter);
    }
}
