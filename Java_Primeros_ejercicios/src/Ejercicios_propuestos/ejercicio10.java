/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_propuestos;

/**
 *
 * @author juang
 * Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 */
public class ejercicio10 {
    public static void main(String[] args) {
        boolean aux= false;
        int i=1;
        while(aux==false){
            System.out.println(i);
            i++;
            if(i==101){
                aux=true;
            }
        }
    }
}
