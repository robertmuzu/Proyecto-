package paquete;

import java.util.ArrayList;


public class Persona {
    
    //Creamos atributos de las personas que van a usar el APP.
    protected String nombre;
    protected String apellidos;
    protected String correo;
    protected boolean sexo;
    protected int edad;
    protected String numeroTelefono;
    protected String fotoUsuario;
    protected ArrayList <Perfil> perfilesAsociados;
    protected Perfil perfilActivo;
    
    //CONSTRUCTOR VACIO
    public Persona(){
        
    }
    
    //CONSTRUCTOR
    public Persona(String nombre, String apellidos, String correo, boolean sexo, int edad, String numeroTelefono) {
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

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    
}
