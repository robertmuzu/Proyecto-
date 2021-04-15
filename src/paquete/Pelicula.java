
package paquete;
/**
 *
 * @author GABRIEL CHAVES G
 */
public class Pelicula {
   
    //Creamos atributos para las peliculas que se van a usar en el APP.
   private String Nombre;
   private String Lenguaje;
   private String Descripcion;
   private Comentario Comentario;
   private String Categoria;
   

//Constructor vacio
    public Pelicula (){
        
    }
   
    //Constructor
     public Pelicula(String Nombre, String Lenguaje, String Descripcion, Comentario Comentario,String Categoria) {
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

    public Comentario getComentario() {
        return Comentario;
    }

    public String getCategoria() {
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

    public void setComentario(Comentario Comentario) {
        this.Comentario = Comentario;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
}
