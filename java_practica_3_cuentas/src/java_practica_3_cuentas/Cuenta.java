/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_practica_3_cuentas;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private String contraseñaCuenta;
    private double tipoInteres;
    private double saldo;

    //constructor normal
    public Cuenta(String nombreCliente, String numeroCuenta,String contraseñaCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.contraseñaCuenta=contraseñaCuenta;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.setSaldo(saldo);
    }

    //constructor vacio
    public Cuenta() {
    }

    //constructor copia
    public Cuenta(Cuenta c1) {
        this.nombreCliente = c1.nombreCliente;
        this.numeroCuenta = c1.numeroCuenta;
        this.contraseñaCuenta=c1.contraseñaCuenta;
        this.tipoInteres = c1.tipoInteres;
        this.saldo = c1.saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public String getcontraseñaCuenta() {
        return contraseñaCuenta;
    }

    public void setcontraseñaCuenta(String contraseñaCuenta) {
        this.contraseñaCuenta = contraseñaCuenta;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        boolean salir=false;
        Scanner lector= new Scanner(System.in);
        while(salir==false){
            if(saldo>=0){
                this.saldo=saldo;
                salir=true;
            }else{
                System.out.println("El saldo tiene que ser positivo");
                System.out.println("Introduce otra vez el saldo");
                saldo=lector.nextDouble();
            }
        }
    }

    public void SolicitarDatos() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        this.setNombreCliente(lector.nextLine().toString());
        System.out.println("Introduce el numero de cuenta");
        this.setNumeroCuenta(lector.nextLine().toString());
        System.out.println("Introduce la contraseña de cuenta");
        this.setcontraseñaCuenta(lector.next());
        System.out.println("Introduce el tipo de interes");
        this.setTipoInteres(lector.nextDouble());
        System.out.println("Introduce el saldo de la cuenta");
        this.setSaldo(lector.nextDouble());
    }

    public boolean ingreso(double ingreso) {
        if (ingreso >= 0) {
            this.saldo += ingreso;
            System.out.println("Has ingresado " + ingreso + " euros");
            System.out.println("El saldo total es de: " + this.saldo);
            return true;
        } else {
            return false;
        }
    }

    public boolean reintegro(double reintegro) {
        if (this.saldo - reintegro > 0) {
            System.out.println("Aqui tienes tu dinero");
            this.saldo = this.saldo - reintegro;
            return true;
        } else {
            System.out.println("No tienes saldo suficiente");
            return true;
        }
    }
    
    public void transferencia(Cuenta cuentaDestino, double ingreso){
        if(this.saldo-ingreso>=0){
            this.saldo=this.saldo-ingreso;
            cuentaDestino.saldo+=ingreso;
            System.out.println("La transferencia se ha realizado corecctamente");
        }else{
            System.out.println("No se puede realizar la operación ya que no hay"
                    + "suficiente saldo en la cuenta de origen");
        }
    }
}
