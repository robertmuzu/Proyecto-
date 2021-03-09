package paquete;


public class Persona {
    
    //Creamos atributos de las personas que van a usar el APP.
    protected String nombre;
    protected String apellidos;
    protected int cedula;
    protected boolean sexo;
    protected int edad;
    protected int numeroTelefono;
    
    //CONSTRUCTOR VACIO
    public Persona(){
        
    }
    
    //CONSTRUCTOR
    public Persona(String nombre, String apellidos, int cedula, boolean sexo, int edad, int numeroTelefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    
}
