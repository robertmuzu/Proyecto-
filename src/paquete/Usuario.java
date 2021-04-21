package paquete;

import java.io.Serializable;

public class Usuario extends Persona implements Serializable, Comparable<Persona> {

    //SE CREAN ATRIBUTOS UNICOS PARA EL USUSARIO.
    protected String nombreUsuario;
    protected String contrasena;
    private Boolean isAdmin;

    //CONSTRUCTOR VACIO
    public Usuario() {

    }

    //CONSTRUCTOR    
    public Usuario(String nombre, String apellidos, String correo, String sexo, String edad, String numeroTelefono, String nombreUsuario, String contrasena, Boolean isAdmin) {
        super(nombre, apellidos, correo, sexo, edad, numeroTelefono);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.isAdmin = isAdmin;
    }

    //GETTERS AND SETTERD
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public boolean equals(Object y) {
        try {
            Usuario usu = (Usuario) y;
            return this.nombreUsuario.equals(usu.getNombreUsuario());
        } catch (Exception ex) {
            return false;
        }
    }
}
