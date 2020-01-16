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
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un radio");
        double radio=scanner.nextDouble();
        double area=Math.PI*Math.pow(radio, 2);
        System.out.println(area);
    }
}
