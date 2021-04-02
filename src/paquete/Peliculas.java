
package paquete;
/**
 *
 * @author GABRIEL CHAVES G
 */
public class Peliculas {
   
    //Creamos atributos para las peliculas que se van a usar en el APP.
   private String Nombre;
   private String Lenguaje;
   private String Descripcion;
   private String Comentario;
   private Categoria Categoria;
   

//Constructor vacio
    public Peliculas (){
        
    }
   
    //Constructor
     public Peliculas(String Nombre, String Lenguaje, String Descripcion, String Comentario,Categoria Categoria) {
        this.Nombre = Nombre;
        this.Lenguaje = Lenguaje;
        this.Descripcion = Descripcion;
        this.Comentario = Comentario;
        this.Categoria = Categoria; 
    }
     
    //GETTERS AND SETTERS

    public String getNombre() {
        return Nombre;
    }

    public String getLenguaje() {
        return Lenguaje;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getComentario() {
        return Comentario;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setLenguaje(String Lenguaje) {
        this.Lenguaje = Lenguaje;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }

 
    
      
}
