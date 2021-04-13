package paquete;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class MainSerializacion {
    
    public static void main(String[] args) {
     
      //CREAREMOS UN PAR DE OBJETOS QUE QUEREMOS ALMACENAR EN UN ARCHIVO
                        
      //Contacto vContacto1 = new Contacto("Pedro Ruiz", "+506-8888-6666", "pedro@ruiz.com");
      //Contacto vContacto2 = new Contacto("Ana Mora", "+506-8888-7777", "ana@mora.com");
      
      
      Admin ad = new Admin("roberto", "1234", "muribeto24@gmail.com");
      Admin ad1 = new Admin("alee", "5678", "@gmail.com");
      Admin ad2 = new Admin("gabriel", "12345", "@gmail.com");
      Admin ad3 = new Admin("gabriel(tatu)", "8888888", "@gmail.com");
      Admin ad4 = new Admin("element", "123", "@gmail.com");
                  
    //VAMOS A PROCEDER PRIMERO A GUARDALO EN UN ARCHIVO            
     
        /*try {
            //PRIMERO NECESITAMOS CREAR EL FILEOUTPUTSTREAM PARA HACER REFERENCIA A NUESTRO ARCHIVO
            FileOutputStream miArchivo = new FileOutputStream("Admins.roberto");//pueden colocar una direccion especifica
            
            //LUEGO NECESITAMOS CREAR EL OBJECTOUTPUTSTREAM
            ObjectOutputStream output = new ObjectOutputStream(miArchivo);
            
            
            //Y LUEGO VAMOS A ESCRIBIR NUESTROS OBJETOS EN EL ARCHIVO
            output.writeObject(ad);
            output.writeObject(ad1);
            output.writeObject(ad2);
            output.writeObject(ad3);
            output.writeObject(ad4);
            //RECORDEMOS CERRAR EL ARCHIVO LUEGO DE ESCRIBIR EN EL
            output.close();
            miArchivo.close();
        
        } catch (IOException ex) {
            System.out.println("Exception: "+ ex.getMessage());
        }*/
        
       /* try {
            FileOutputStream arc = new FileOutputStream("Admins.roberto");
            
            ObjectOutputStream output = new ObjectOutputStream(arc);
            
            output.writeObject(ad);
            output.writeObject(ad1);
            output.writeObject(ad2);
            output.writeObject(ad3);
            output.writeObject(ad4);
            
            
            output.close();
            arc.close();
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Exception" + ex.getMessage());
        }*/
        
        
        
     //VAMOS AHORA A PROCEDER A LEER LOS DATOS DEL ARCHIVO
        try {                   
            //PRIMERO NECESITAMOS CREAR EL FILEIMPUTSTREAM
            FileInputStream Admins = new FileInputStream("Admins.roberto");
            
            //LUEGO NECESITAMOS CREAR EL OBJECTIMPUTSTREAM
            ObjectInputStream input = new ObjectInputStream(Admins);
            
            //Y LUEGO VAMOS A LEER LOS DATOS DE NUESTRO ARCHIVO
            //ES MUY IMPORTANTE QUE DEBEMOS LEERLOS DE IGUAL MANERA COMO LOS ESCRIBIMOS
            //Y QUE DEBEMOS EJECUTAR EL CASTING CORRECTO
            
            Admin adLeido = (Admin) input.readObject();
            Admin ad1Leido = (Admin) input.readObject();
            Admin ad2Leido = (Admin) input.readObject();
            Admin ad3Leido = (Admin) input.readObject();
            Admin ad4Leido = (Admin) input.readObject();
            
            System.out.println("EL PRIMER CONTACTO ERA "+ adLeido.getNombreUsuario() + "-" + adLeido.getContrasena());
            System.out.println("EL SEGUNDO CONTACTO ERA "+ ad1Leido.getNombreUsuario() + "-" + ad1Leido.getContrasena());
            System.out.println("El Tercer contacto era: " + ad2Leido.getNombreUsuario() + "-" + ad2Leido.getContrasena());
            System.out.println("El cuarto es: " + ad3Leido.getNombreUsuario() + "-" + ad3Leido.getContrasena());
            System.out.println("El quinto es " + ad4Leido.getNombreUsuario() + "-" + ad4Leido.getContrasena());
            
            //POR ULTIMO RECORDEMOS CERRAR EL ARCHIVO
            input.close();
            Admins.close();
                    
            
        } catch (Exception ex) {
            System.out.println("Exception: "+ ex.getMessage());
        }
      
      
    } 
    
}
