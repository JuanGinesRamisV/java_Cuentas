/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_practica_3_cuentas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Java_practica_3_cuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Cuenta> Cuentas = new ArrayList <Cuenta> ();
        int i;
        boolean salir = false;
        int x; //variable para el menu
        Scanner Lector = new Scanner(System.in);
        Cuenta juan = new Cuenta();
        Cuenta david = new Cuenta();
        juan.SolicitarDatos();
        david.SolicitarDatos();
        while(salir==false){
            System.out.println("---------------------------------");
            System.out.println("1)Ingreso en la cuenta juan");
            System.out.println("2)Ingreos en la cuenta david");
            System.out.println("3)Reintegro en la cuenta juan");
            System.out.println("4)Reintegro en la cuenta david");
            System.out.println("5)transferencia de juan a david");
            System.out.println("6)Transferencia de david a juan");
            System.out.println("9)ver el saldo de ambos");
            System.out.println("---------------------------------");
            x=Lector.nextInt();
            if(x==1){
                System.out.println("------");
                System.out.println("Introduce el valor dels ingreso");
                juan.ingreso(Lector.nextDouble());
            }else if (x==2){
                System.out.println("------");
                System.out.println("Introduce el valor del ingreso");
                david.ingreso(Lector.nextDouble());
            }else if (x==3){
                System.out.println("-----");
                System.out.println("Introduce el valor del reintegro");
                juan.reintegro(Lector.nextDouble());
            }else if(x==4){
                System.out.println("------");
                System.out.println("Introduce el valor del reintegro");
                david.reintegro(Lector.nextDouble());
            }else if(x==5){
                System.out.println("------");
                System.out.println("Introduce el valor de la transferencia");
                juan.transferencia(david, Lector.nextDouble());
            }else if(x==6){
                System.out.println("------");
                System.out.println("Introduce el valor de la transferencia");
                david.transferencia(juan, Lector.nextDouble());
            }else if(x==9){
                System.out.println(juan.getSaldo());
                System.out.println(david.getSaldo());
            }
        }
        
    }
    public static void añadirCuenta(ArrayList<Cuenta> lista){
            Cuenta pepe = new Cuenta();
            lista.add(pepe);
        }
}
