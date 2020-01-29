/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarpersonas;

/**
 *
 * @author juang
 */
public class GestionarPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1=new Persona();
        p1.SolicitarDatos();
        System.out.println("------------");
        p1.ObtenerDatos();
    }   
}
