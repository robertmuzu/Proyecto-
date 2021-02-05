package finaltienda;

/**
 *
 * @author Gabriel
 */
public class Administrador {
     private String Nombre;
     private int Id;
     private String Email;
     private String Clave;  

    public Administrador(String Nombre, int Id, String Email, String Clave) {
        this.Nombre = Nombre;
        this.Id = Id;
        this.Email = Email;
        this.Clave = Clave;
    }

    Administrador(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Datos del Administrador"+ "\nNombre:" + Nombre +"\nId: "+Id
                + "\nEmail:" + Email+"\nClave: "+Clave; 
    }
     
    
     
}
