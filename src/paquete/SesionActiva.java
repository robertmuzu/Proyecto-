/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Alexa
 */
public class SesionActiva {
    
    private static Persona persona;

    public static void setPersona(Persona aPersona) {
        persona = aPersona;
    }

    public static Persona getPersona() {
        return persona;
    }
    
}
