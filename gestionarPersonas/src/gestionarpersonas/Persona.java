/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarpersonas;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private Nif infoNif;

    public Persona() {
    }

    public Persona(String nombre, String apellido1, String apellido2, int edad, Nif nif) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.infoNif = nif;
    }
    
    public Persona(Persona p1) {
        this.nombre=p1.nombre;
        this.apellido1 = p1.apellido1;
        this.apellido2 = p1.apellido2;
        this.edad = p1.edad;
        this.infoNif = p1.infoNif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Nif getInfoNif() {
        return infoNif;
    }

    public void setNif(Nif nif) {
        this.infoNif = nif;
    }
    //metodos de instancia de la clase persona
    public void SolicitarDatos(){
        Scanner lector = new Scanner(System.in);
        Nif n2 = new Nif();
        System.out.println("Escribe el nombre");
        this.setNombre(lector.nextLine());
        System.out.println("Escribe el primer apellido");
        this.setApellido1(lector.nextLine());
        System.out.println("Escribe el segundo apellido");
        this.setApellido2(lector.nextLine());
        System.out.println("Escribe la edad");
        this.setEdad(Integer.parseInt(lector.nextLine()));
        n2.solicitarDatos();
        this.setNif(n2);
    }
    public void ObtenerDatos(){
        System.out.println("El nombre del usuario es "+this.getNombre());
        System.out.println("El primer apellido del usuario es "+this.getApellido1());
        System.out.println("El segundo apellido del usuario es "+this.getApellido2());
        System.out.println("la edad del usuario es "+this.getEdad());
        this.getInfoNif().ObtenerDatos();
    }

    
}