package finaltienda;

import javax.swing.JOptionPane;


/**
 *
 * @author Gabriel
 */
public class Cases {
    

         public static int DemeNum(String msj){
             String n = JOptionPane.showInputDialog(msj);
             int x = Integer.parseInt(n);
             return x;
         
    }

  public static void UNOcase(){
      int numero;
      do {
      numero = DemeNum("BIENVENIDO!!"+ "\n1. Registrese aquí"+"\n2. Ingresar"
                 + "\n3. Salir"+"\nIngrese alguna opción");
       
     if  (numero ==1){
         BuscarIngresar.IngCliente();
         BuscarIngresar.AgCliente();
         
     } else {
         if (numero ==2){
             JOptionPane.showInputDialog("Favor ingrese su Id");
            BuscarIngresar.BusCliente(); 
            JOptionPane.showInputDialog("Favor ingrese su Clave");
            BuscarIngresar.BuskCliente();
            Trescase();
         }
     }      
      } while (numero >3);
      System.out.println("");
      
        
  } 
   /* Fin Case 1 */
  
  public static void Doscase(){
      int numero;
      do {
      numero = DemeNum("BIENVENIDO!!"+"\n1.Ingrese su Id"+"\nIngrese la opción 0 para salir");
       
     if  (numero ==1){
          JOptionPane.showInputDialog("Favor ingrese su Id");
          BuscarIngresar.InicProduct();
          BuscarIngresar.BusCliente(); 
          BuscarIngresar.BusAdmi();
          BuscarIngresar.MostAdmi();
          
               
         
     } else {
         if (numero >2){
             
         }
     }      
      } while (numero >1);
      System.out.println("");
      
      
  }
   /* Fin Case 2 */
  
   public static void Trescase(){
      int numero;
      do {
      numero = DemeNum("BIENVENIDO!!"+ "\n1.Ver Lista"+"\n2.Agregar a la compra"
                 + "\n3. Salir"+"\nIngrese alguna opción");
       
     if  (numero ==1){
        Tienda.inicProduc();
        Tienda.mostrarProducto();
         
         
         
     } else {
         if (numero ==2){
             Compra.Compra();
                           
         }
     }      
      } while (numero >3);
      System.out.println("");
      
      
  }
    /* Fin Case 3 */
   
  public static void Cuatrocase(){
      int numero;
      do {
      numero = DemeNum("BIENVENIDO!!"+"Deseas meter producto nuevo"+ "\n1. SI"+"\n2. NO"
                 + "\n3. Salir"+"\nIngrese alguna opción");
       
     if  (numero ==1){
          BuscarIngresar.InicProduct();
          BuscarIngresar.RegisProduc();   
          /* Producto stock */  
         
         
         
     } else {
         if (numero ==2){
              
         }
     }      
      } while (numero >3);
      System.out.println("");
      
      
  } 
  /* Fin Case 4 */
}
        
      