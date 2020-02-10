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
        ArrayList<Cuenta> Cuentas = new ArrayList<Cuenta>();
        int i;
        boolean salir = false;
        boolean sesionIniciada = false;
        int aux = 0;
        int valorDinero; //varaible para el valor con el que se realizara la accion
        int x; //variable para el menu
        int auxIngreso;
        Scanner Lector = new Scanner(System.in);

        while (salir == false && sesionIniciada == false) {
            System.out.println("---------------------------------");
            System.out.println("| 1)Dasrse de alta              |");
            System.out.println("| 2)Iniciar sesion              |");
            System.out.println("---------------------------------");
            System.out.println("");
            System.out.print("Introduce una opción:");
            x = Lector.nextInt();
            if (x == 1) {
                añadirCuenta(Cuentas);
            } else if (x == 2) {
                aux = buscarCuenta(Cuentas);
                if (aux != -1) {
                    if (iniciarSesion(Cuentas, aux) == true) {
                        System.out.println("has iniciado sesion");
                        sesionIniciada = true;
                    } else {
                        System.out.println("la contraseña es incorrecta");
                    }
                } else {
                    System.out.println("La cuenta no existe");
                }
            } else if (x == 3) {
                salir = true;
            }
        }

        if (sesionIniciada == true) {
            int menu2 = 0;
            while (menu2 != 4) {
                System.out.println("-------------------");
                System.out.println("| 1)añadir saldo   |");
                System.out.println("| 2)retirar dinero |");
                System.out.println("| 3)Transferencia  |");
                System.out.println("| 4)Salir  |");
                System.out.println("-------------------");
                System.out.println("");
                System.out.println("Introduce la opcion que quieras");
                menu2 = Lector.nextInt();
                if (menu2 == 1) {
                    System.out.println("Introduce el valor que quieres ingresar");
                    valorDinero = Lector.nextInt();
                    Cuentas.get(aux).ingreso(valorDinero);
                } else if (menu2 == 2) {
                    System.out.println("Introduce el valor que quieres retirar");
                    valorDinero = Lector.nextInt();
                    Cuentas.get(aux).reintegro(valorDinero);
                } else if (menu2 == 3) {
                    System.out.println("Introduce el numero de cuenta de la "
                            + "cuenta a la que quieres transferir el dinero");
                    auxIngreso = buscarCuenta(Cuentas);
                    if (auxIngreso != -1) {
                        System.out.println("Introduce el valor que quieres ingresar"
                                + "a" + Cuentas.get(auxIngreso).getNombreCliente());
                        valorDinero = Lector.nextInt();
                        Cuentas.get(aux).transferencia(Cuentas.get(auxIngreso), valorDinero);
                    } else {
                        System.out.println("La cuenta de destino no existe");
                    }
                }
            }
        }
    }
    
    public static void añadirCuenta(ArrayList<Cuenta> lista) {
        Cuenta pepe = new Cuenta();
        pepe.SolicitarDatos();
        lista.add(pepe);
    }

    public static boolean iniciarSesion(ArrayList<Cuenta> lista, int indice) {
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce la "
                + "contraseña de la cuenta" + lista.get(indice).getNombreCliente());
        String contraseña = lector.nextLine();
        if (contraseña.equals(lista.get(indice).getcontraseñaCuenta())) {
            return true;
        } else {
            return false;
        }
    }

    public static int buscarCuenta(ArrayList<Cuenta> lista) {
        int i = 0;
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int indice = -1;
        System.out.println("hola introduce tu cuenta");
        String cuenta = lector.nextLine();
        while (salir == false) {
            if (lista.get(i).getNumeroCuenta().equals(cuenta)) {
                indice = i;
                salir = true;
            } else if (i == lista.size() - 1) {
                indice = -1;
                salir = true;
            } else {
                i++;
            }
        }
        return indice;
    }

}
