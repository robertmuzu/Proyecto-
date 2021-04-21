
package paquete;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author GABRIEL CHAVES G
 */
public class Pelicula implements Serializable{
   
    //Creamos atributos para las peliculas que se van a usar en el APP.
   private String Nombre;
   private String Lenguaje;
   private String Descripcion;
   private ArrayList<Comentario> Comentarios;
   private Categoria Categoria;
   private String UrlImagen;
   

//Constructor vacio
    public Pelicula (){
        this.Comentarios = new ArrayList<>();
    }
   
    //Constructor
    public Pelicula(String Nombre, String Lenguaje, String Descripcion, Categoria Categoria,String UrlImagen) {
        this.Nombre = Nombre;
        this.Lenguaje = Lenguaje;
        this.Descripcion = Descripcion;
        this.Comentarios = new ArrayList<>();
        this.Categoria = Categoria;
        this.UrlImagen = UrlImagen;
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

    public ArrayList getComentario() {
        return Comentarios;
    }
    
    public void setComentarios(ArrayList<Comentario> Comentarios) {
        this.Comentarios = Comentarios;
    }

    public void addComentario(Comentario Comentario) {
        this.Comentarios.add(Comentario);
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }

    public String getUrlImagen() {
        return UrlImagen;
    }

    public void setUrlImagen(String UrlImagen) {
        this.UrlImagen = UrlImagen;
    }
    
}
