package paquete;


public class Usuario extends Persona{
    
    //SE CREAN ATRIBUTOS UNICOS PARA EL USUSARIO.
    protected String nombreUsuario;
    protected String contrasena;
    
    
    //CONSTRUCTOR VACIO
    public Usuario(){
        
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
    
    
    
    

    
    
    
    
}
