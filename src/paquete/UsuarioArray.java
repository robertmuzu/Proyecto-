package paquete;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;


public class UsuarioArray implements Serializable{
    
    private ArrayList<Usuario> usuarios;

    public UsuarioArray(){
        
    }
    
    public UsuarioArray(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
