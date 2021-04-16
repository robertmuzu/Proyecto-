
package Interfaz;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author GABRIEL CHAVES G
 */
public class CambiarImagen {
//Argumentos aqui
    
    static int contador = 0;
    
    public static void main(String[] args) {
        // Clase main
 
      int velocidad = 2; // segundos
      
      Timer timer;
      TimerTask tarea;
      
      int velmil = velocidad*1000;
      
      Catalogo catalogo = new Catalogo();
      catalogo.setVisible(true);
      
      tarea = new TimerTask(){
          @Override
          public void run() {
              Icon icono;
              
              switch(contador){
                  case 0: 
                      contador = 1;
                          icono = new ImageIcon(getClass().getResource("/iconos/007_1.jpg"));
                      catalogo.jLabel1.setIcon(icono);
                      break;
                   case 1: 
                       contador = 2;
                      icono = new ImageIcon(getClass().getResource("/iconos/blackwidow.jpg"));
                      catalogo.jLabel1.setIcon(icono);
                      break;   
                  case 2: 
                       contador = 3;
                      icono = new ImageIcon(getClass().getResource("/iconos/jumanji.jpg"));
                      catalogo.jLabel1.setIcon(icono);
                      break;
                  case 3: 
                       contador = 4;
                      icono = new ImageIcon(getClass().getResource("/iconos/mulan.jpg"));
                      catalogo.jLabel1.setIcon(icono);
                      break;
                  case 4: 
                       contador = 5;
                      icono = new ImageIcon(getClass().getResource("/iconos/onward.jpg"));
                      catalogo.jLabel1.setIcon(icono);
                      break;
                  case 5: 
                       contador = 0;
                      icono = new ImageIcon(getClass().getResource("/iconos/reinadelsur.jpg"));
                      catalogo.jLabel1.setIcon(icono);
                      break;    
              }
         }
          
      };
      
      timer = new Timer();
      
      timer.scheduleAtFixedRate(tarea, velmil, velmil);
  
}
}
