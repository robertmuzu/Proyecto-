package finaltienda;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Tienda {

    static Producto Produc[]=new Producto[10];
    public static void inicProduc(){
         Produc[0]=new Producto("Celular Huawei Y5",75000, 15,"123456", "Huawei");
         Produc[1]=new Producto("Cargador Huawei", 9000, 25,"789012", "Huawei");
         Produc[2]=new Producto("Celular Samsung J2 Pro", 45000, 25,"345678", "Samsung");
         Produc[3]=new Producto("Cable cargador de 5m", 4500, 15,"901234", "Patox S.A.");
         Produc[4]=new Producto("Estuche Celular", 3000, 55,"567890", "Estuchex S.A.");
         Produc[5]=new Producto("Vidrio Temperado", 4500, 30,"298765", "Patox S.A.");
         Produc[6]=new Producto("Celular Huawei P20 lite",150000, 25,"432109", "Huawei");
         Produc[7]=new Producto("Celular Samsung J4 Core", 145000, 20,"876543", "Samsung");
         Produc[8]=new Producto("Mouse inalambrico", 12500, 18,"210987", "Microsoft");
         Produc[9]=new Producto("Juego de PC/ Fifa 18", 7000, 8,"654321", "EA Sport");
         
    }
    /* Fin de inicProducto*/
    
    public static void mostrarProducto(){
        JOptionPane.showMessageDialog(null, "Bienvenido!!"+"\n"+"Se el mostrará c/u de los objetos de la Tienda"+
                "\n"+"Y despues se le desplega una lista del contenido total");
        
             JOptionPane.showMessageDialog(null, "\n\n"+" Nombre: "+"Celular Huawei Y5"+"\n"+" Código: "+ "123456"+
                     " \n "+"Precio: "+75000+"\n"+"Stock:"+ 15+"\n"+"Entregado por: "+ "Huawei"+"\n\n"+" Nombre: "+
                     "Cargador Huawei "+"\n"+ "Código: "+ "789012"+ " \n "+"Precio: "+9000+"\n"+"Stock:"+ 25+"\n"+
                     " Entregado por: "+ "Huawei"+"\n\n"+" Nombre: "+"Celular Samsung J2 Pro "+"\n"+" Código: "+ " 345678 "+
                     " \n "+"Precio: "+45000+"\n"+" Stock: "+ 25+"\n"+"Entregado por: "+ " Samsung"+"\n\n"+" Nombre: "+
                     "Cable cargador de 5m"+"\n"+" Código: "+ "901234"+" \n "+"Precio: "+4500+"\n"+" Stock: "+ 15+
                     "\n"+" Entregado por: "+ "Patox S.A."+"\n\n"+" Nombre: "+"Estuche Celular"+"\n"+" Código: "+
                     "567890"+" \n "+"Precio: "+3000+"\n"+" Stock: "+ 55+"\n"+" Entregado por: "+ "Estuchex S.A.");
             
             JOptionPane.showMessageDialog(null,"\n\n"+" Nombre: "+"Vidrio Temperado"+"\n"+" Código: "+ "098765"+
                     " \n "+"Precio: "+4500+"\n"+" Stock: "+ 30+"\n"+" Entregado por: "+ "Patox S.A."+"\n\n"+" Nombre: "+
                     "Celular Huawei P20 lite"+"\n"+" Código: "+ "432109"+ 
                     " \n "+"Precio: "+150000+"\n"+" Stock: "+ 25+"\n"+" Entregado por: "+ "Huawei"+"\n\n"+" Nombre: "+
                     "Celular Samsung J4 Core"+"\n"+" Código: "+ "876543"+
                     " \n "+"Precio: "+145000+"\n"+" Stock: "+ 20+"\n"+" Entregado por: "+ "Samsung"+"\n\n"+" Nombre: "+
                     "Mouse inalambrico"+"\n"+" Código: "+ "210987"+" \n "+"Precio: "+12500+"\n"+" Stock: "+ 18+
                     "\n"+" Entregado por: "+ "Microsoft"+"\n\n"+" Nombre: "+"Juego de PC/ Fifa 18"+"\n"+" Código: "+
                     "654321"+" \n "+"Precio: "+7000+"\n"+" Stock: "+ 8+"\n"+" Entregado por: "+ "EA Sport");
                
           
             System.out.printf("%20s %11s %8s %10s %25s\n", "Nombre", "Código", "Precio", "Stock", "Distribuidor");
            for (int n = 0; n < Produc.length; n++) {
            System.out.printf("%25s %6s %7d %10d %30s\n", (n+1+".")+Produc[n].getNombre(), Produc[n].getCodigo(), 
                    Produc[n].getPrecio(), Produc[n].getStock(), Produc[n].getDistribuidor());
              }


   
} 
}
