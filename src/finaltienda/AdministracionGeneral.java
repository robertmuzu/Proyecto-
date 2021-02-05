package finaltienda;

import static finaltienda.Cases.DemeNum;
import javax.swing.JOptionPane;



/**
 *
 * @author Gabriel
 */
public class AdministracionGeneral {
    
    public static int devolverNum(String msj){
        int x =Integer.parseInt(JOptionPane.showInputDialog(msj));
        return x;
    }
  
    public static void menu(){
      int opcion = devolverNum("1.INICIO");
       
      switch (opcion){
          case 1:
              Cases.UNOcase();
              
              break;
          case 2:
              
              Cases.Trescase();

              
              break;
          case 3:
              Cases.Trescase();
              
              break;
              
          case 4:
              Cases.Cuatrocase();
              
              break;
              
      }
      
      
      
      
  }
   }     