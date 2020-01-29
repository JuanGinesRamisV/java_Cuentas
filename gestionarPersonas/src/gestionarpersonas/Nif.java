/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarpersonas;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Nif {
    private String nif;
    private String direccion;
    private String nombrePadre;
    private String nombreMadre;

    public Nif(String nif, String direccion, String nombrePadre, String nombreMadre) {
        this.nif = nif;
        this.direccion = direccion;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
    }

    public Nif() {
    }

    
    
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre.toUpperCase();
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }
    
    public void solicitarDatos(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el nif");
        this.setNif(lector.nextLine());
        System.out.println("Introduce la dirección");
        this.setDireccion(lector.nextLine());
        System.out.println("Introduce el nombre del padre");
        this.setNombrePadre(lector.nextLine());
        System.out.println("Introduce el nombre de la madre");
        this.setNombreMadre(lector.nextLine());
    }
    
    public void ObtenerDatos(){
        System.out.println("El nif es "+this.getNif());
        System.out.println("La dirección es "+this.getDireccion());
        System.out.println("El nombre del padre es "+this.getNombrePadre());
        System.out.println("El nombre de la madre es "+this.getNombreMadre());
    }
}
