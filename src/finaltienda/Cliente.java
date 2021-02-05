package finaltienda;



/**
 *
 * @author Gabriel
 */
public class Cliente {
     private String Nombre;
     private int Id;
     private String Email;
     private int Celular;
     private int Edad;
     private String Clave;

    public Cliente(String Nombre, int Id, String Email, int Celular, int Edad, String Clave) {
        this.Nombre = Nombre;
        this.Id = Id;
        this.Email = Email;
        this.Celular = Celular;
        this.Edad = Edad;
        this.Clave = Clave;
    }

    Cliente() {
     
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

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Datos del Cliente"+ "\nNombre:" + Nombre +"\nId: "+Id
                + "\nEmail:" + Email+ "\nNumero de Teléfono: " +Celular
                + "\nEdad:" +Edad+"\nClave: "+Clave; 
    }  
      
}
