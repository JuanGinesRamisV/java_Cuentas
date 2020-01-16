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
 * Lee un número por teclado que pida el precio de un producto 
 * (puede tener decimales) y calcule el precio final con IVA. 
 * El IVA sera una constante que sera del 21%.
 */
public class ejercicio9 {
    public static void main(String[] args) {
        final double iva = 0.21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        double precio=scanner.nextDouble();
        System.out.println("------------------");
        System.out.println("El precio final del producto es: "+(precio+(precio*iva)));
    }
}
