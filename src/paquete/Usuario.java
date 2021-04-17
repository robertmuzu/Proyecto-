package paquete;

import java.io.Serializable;

public class Usuario implements Serializable, Comparable<Usuario> {

    //SE CREAN ATRIBUTOS UNICOS PARA EL USUSARIO.
    protected String nombreUsuario;
    protected String contrasena;

    //CONSTRUCTOR VACIO
    public Usuario() {

    }

    //CONSTRUCTOR
    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
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

    @Override
    public int compareTo(Usuario nUsuario) {
        return this.nombreUsuario.compareTo(nUsuario.getNombreUsuario());
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
