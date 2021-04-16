
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
   private Categoria Categoria;
   

//Constructor vacio
    public Pelicula (){
        
    }
   
    //Constructor
    public Pelicula(String Nombre, String Lenguaje, String Descripcion, Comentario Comentario, Categoria Categoria) {
        this.Nombre = Nombre;
        this.Lenguaje = Lenguaje;
        this.Descripcion = Descripcion;
        this.Comentario = Comentario;
        this.Categoria = Categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLenguaje() {
        return Lenguaje;
    }

    public void setLenguaje(String Lenguaje) {
        this.Lenguaje = Lenguaje;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Comentario getComentario() {
        return Comentario;
    }

    public void setComentario(Comentario Comentario) {
        this.Comentario = Comentario;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }
    
}
