package finaltienda;


import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class BuscarIngresar {
    
     public static int devolverNum(String msj){
        int x =Integer.parseInt(JOptionPane.showInputDialog(msj));
        return x;
    }
    
    static Cliente Client[] = new Cliente[4];
    /*Buscar Cliente por Id*/
    public static int BusCliente(int ced){
        int indice = -1,f;
        for (f = 0; f <Client.length; f++) {
            if(Client[f].getId()==ced){
                indice=f;
                break;
            }
        }
    return indice;
    }   
/*Fin Buscar Cliente por Id*/
    
    /* Buscar al Cliente por Clave */
public static int BuskCliente(String Clave){
        int indice = -1,f;
        for (f = 0; f <Client.length; f++) {
            if(Clave.equals(Client[f].getClave())){
                indice=f;
                break;
            }
        }
    return indice;
    }    
 /* Fin de buscar Cliente por Clave */

 /* Ingresar Cliente */
    public static void IngCliente(){
        for (int h = 0; h <Client.length; h++) {
            Client[h] = new Cliente();
            
        }
    } 
   /* Fin Ingresar Cliente */
    
       /* Rellenar Cliente */
   static void AgCliente(){
      int i;
      String Clave;
      String Temp;
    
       i=BuscEspa();
      if (i!=1){
          Client[i].setNombre(JOptionPane.showInputDialog("Ingrese su Nombre"));
          Client[i].setId(devolverNum("Digite su Id"));
          Client[i].setEmail(JOptionPane.showInputDialog("Digite su Email"));
          Client[i].setEdad(devolverNum("Ingrese su Edad"));
          Client[i].setCelular(devolverNum("Digite su Teléfono"));
          Clave = JOptionPane.showInputDialog("Ingrese su contraseña");
          do{
          Temp= JOptionPane.showInputDialog("Ingrese su contraseña nuevamente");
          if (Temp!= Clave)
          {System.out.println("");} 
          }while(!Temp.equals(Clave));
          Client[i].setClave(Clave);
          Cases.Doscase();
      }
      else {
          JOptionPane.showMessageDialog(null, "No hay espacio");
      }
      
 
   }
  /* Fin de Rellenar Cliente */ 
   
   /* Mostrar Clientes */
   public static void MostCliente(){
       int in =-1,i,j;
       System.out.println("Estos son los Clientes Registrados");
       for (j = 0; j < Client.length; j++) {
          if (Client[j].getId()!=0 ){
               System.out.println(""+"\n"+Client[j]);
           }         
       }
       System.out.println("");
   }
   /* Fin de mostrar Cliente */
   
    /* Busca espacios vacios en el Id */
   public static int BuscEspa(){
       int in= -1 , i=0;
      while (i<Client.length){
          if (Client[i].getId()==0){
              in = i;
              break;
          }
      i++;
      } 
      return in;
   }
   /* Fin buscar espacios vacios en el Id */
    
    static Administrador Admi[] = new Administrador[3];
    
    
    
    /* Ingresar Administrador */
   public static void IngAdmi(){

        for (int h= 0; h<Admi.length; h++) {
        Admi[0] = new Administrador("Gabriel" + 304680699 +  "gabrieltatu_12@outlook.com"+ 1212);
        Admi[h] = new Administrador(null);
        }    
}
   /* */
   
   /*Buscar Administrador por Id*/
    public static int BusAdmi(int ced){
        int indice = -1,f;
        for (f = 0; f <Admi.length; f++) {
            if(Admi[f].getId()==ced){
                indice=f;
                break;
            }
        }
    return indice;
    }
/* Fin buscar Administrador por Id */
   
   /* Buscar al Administrador por Clave */
public static int BuscAdmi(String Clave){
        int indice = -1,f;
        for (f = 0; f <Admi.length; f++) {
            if(Clave.equals(Admi[f].getClave())){
                indice=f;
                break;
            }
        }
    return indice;
    }    
 /* Fin de buscar Administrador por Clave */ 
    
   
    
  

   /* Mostrar Clientes */
   public static void MostAdmi(){
       int in =-1,i,j;
       System.out.println("Estos son los Clientes Registrados");
       for (j = 0; j < Admi.length; j++) {
          if (Admi[j].getId()!=0 ){
               System.out.println(""+"\n"+Admi[j]);
           }         
       }
       System.out.println("");
   }
   /* Fin de mostrar Cliente */
   static Producto Produc[]= new Producto[3];
   /* Registro Producto */
   public static void InicProduct(){
       for (int i = 0; i <Produc.length; i++) {
           Produc[i] = new Producto();
       }
   }
   /* Fin registro de producto */
   public static int BuscEspacio(){
       int in= -1, i = 0;
     while(i<Produc.length){
         if(Produc[i].getStock()==0){
             in=i;
             break;
         }
         i++;
     }  
     return in;
   }
   
   /* Registrar Producto */
public static void RegisProduc(){
    int x=BuscEspacio();
    
    Produc[x].setNombre(JOptionPane.showInputDialog("Ingrese El Nombre del Producto"));
    Produc[x].setCodigo(JOptionPane.showInputDialog("Ingrese el Codigo del Producto"));
    Produc[x].setPrecio(devolverNum("Ingrese el Precio del Producto"));
    Produc[x].setStock(devolverNum("Ingrese cuantas unidades del Producto son"));
    Produc[x].setDistribuidor(JOptionPane.showInputDialog("Ingrese El Nombre del Distribuidor"));
    System.out.println("\n"+Produc[x]);
    
}
/* Fin de Registro del producto*/

    static void BusCliente() {
        
    }

    static void BuskCliente() {
        
    }

    static void BusAdmi() {
      
    }














   
  
           
   
  
   
   
   
   
        
    
}
   
   
   
   
   
   
   
