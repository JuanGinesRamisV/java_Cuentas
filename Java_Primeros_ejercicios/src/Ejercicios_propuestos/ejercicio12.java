/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_propuestos;

/**
 *
 * @author juang
 * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
 * Utiliza el bucle que desees.
 */
public class ejercicio12 {
    public static void main(String[] args) {
        int i;
        for(i=0;i<=100;i++){
            if(i%2==0){
                System.out.println(i+"es divisible entre 2");
            }else if(i%3==0){
                System.out.println(i+"es divisible entre 3");
            }
        }
    }
}
