
package paquete;

public class Documentales {
    
    private String nombre;
    private String Lenguaje;
    private String Descripcion;
    private Comentario Comentario;
    private String Categoria;
    
    public Documentales(){
        
    }

    public Documentales(String nombre, String Lenguaje, String Descripcion, Comentario Comentario, String Categoria) {
        this.nombre = nombre;
        this.Lenguaje = Lenguaje;
        this.Descripcion = Descripcion;
        this.Comentario = Comentario;
        this.Categoria = Categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

}
