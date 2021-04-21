package paquete;

import java.io.Serializable;
import java.util.ArrayList;

public class Persona implements Serializable, Comparable<Persona> {

    //Creamos atributos de las personas que van a usar el APP.
    private String nombre;
    private String apellidos;
    private String correo;
    private String sexo;
    private String edad;
    private String numeroTelefono;
    
    //CONSTRUCTOR VACIO
    public Persona() {

    }

    //CONSTRUCTOR
    public Persona(String nombre, String apellidos, String correo, String sexo, String edad, String numeroTelefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.sexo = sexo;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    

    @Override
    public int compareTo(Persona pPersona) {
        return this.correo.compareTo(pPersona.getCorreo());
    }

    //NECESARIO PARA PODER USAR EL METODO CONTAINS DE LAS COLECCIONES
    @Override
    public boolean equals(Object x) {
        try {
            Persona usuPersona = (Persona) x;
            return this.correo.equals(usuPersona.getCorreo());
        } catch (Exception ex) {
            return false;
        }
    }

}
