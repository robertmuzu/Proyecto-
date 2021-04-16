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
        persona = aPersona; ///Aqui se va a hacer el codigo para que el usuario obtenga la persona loggeada en el momento
    }

    public static Persona getPersona() {
        return persona;
    }
    
}
