package finaltienda;

import static finaltienda.BuscarIngresar.BuscEspa;
import static finaltienda.BuscarIngresar.Client;
import static finaltienda.Tienda.Produc;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Compra {
    
      public static int DemeNum(String msj){
             String n = JOptionPane.showInputDialog(msj);
             int x = Integer.parseInt(n);
             return x;
      }
    
   private String Nombre;
    private int id;
     private String Email;
    private int Celu;
    private String ObNam;
     private String Codigo;
     private int precio;
    private int stock;
   private String distribuidor;
    
    public static void CompraFinal(String Nombre, String ObNam,
            String Codigo, int precio, int stock) {
        precio = precio*stock;
        JOptionPane.showMessageDialog(null, "Su factura es: "+"\n"+"Cliente: "+Nombre+"\n Producto: "+ObNam+
                "\n Precio Total: "+precio);
        
}
    /* Compra final y  Fatura*/
  public static void Compra(){
     /* LLama de la clase Tienda */ 
    Tienda.inicProduc();
    Tienda.mostrarProducto();
    
    int i = DemeNum("Ingrese el numero del producto deseado");
    String Nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
    String ObNam = Produc[i].getNombre();
    String Codigo = Produc[i].getCodigo();
    int precio = Produc[i].getPrecio();
    int stock = DemeNum("Ingrese la cantidad deseada");
    
    CompraFinal(Nombre,ObNam,Codigo,precio,stock);

 
   }
   /* final de Compra final y  Fatura*/

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getCelu() {
        return Celu;
    }

    public void setCelu(int Celu) {
        this.Celu = Celu;
    }

    public String getObNam() {
        return ObNam;
    }

    public void setObNam(String ObNam) {
        this.ObNam = ObNam;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    @Override
    public String toString() {
        return "Cliente" + "\n"+"Nombre: " + Nombre + "\n"+"id: " + id +
                "\n"+"Email: " + Email + "\n"+"# de Celular: " + Celu + "\n"+"Cliente: " +
                ObNam + "\n"+"Codigo: "+ Codigo + "\n"+"Precio: "+precio +"\n"+"Stock: "
                +stock+ "\n"+"Distribuidor: "+ distribuidor;
    }
  
    
    
   
  
       
    
    
}
