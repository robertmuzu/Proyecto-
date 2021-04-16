
package paquete;

public class Categoria {

    private int idCat;
    private String nombreCat;
    
    public Categoria(){
    }

    public Categoria(int idCat, String nombreCat) {
        this.idCat = idCat;
        this.nombreCat = nombreCat;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }
    
    
}
