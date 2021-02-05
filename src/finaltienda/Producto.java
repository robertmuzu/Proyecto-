package finaltienda;

/**
 *
 * @author Gabriel
 */
public class Producto {
     String Nombre;
     int Precio;
     int Stock;
     String Codigo;
     String Distribuidor;

    public Producto(String Nombre, int Precio, int Stock, String Codigo, String Distribuidor) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Codigo = Codigo;
        this.Distribuidor = Distribuidor;
    }

    Producto() {
        
    }

    public String getDistribuidor() {
        return Distribuidor;
    }

    public void setDistribuidor(String Distribuidor) {
        this.Distribuidor = Distribuidor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    @Override
    public String toString() {
        return "Producto" + "\nNombre: "+Nombre+"\nCodigo:"+Codigo+"\nStock: "
                +Stock+"\nPrecio: "+ Precio+"\nDistribuidor: "+Distribuidor;
    }

    void getNombre(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
