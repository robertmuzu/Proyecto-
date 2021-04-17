package paquete;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;

public class ListaUsuarios implements Serializable{
    
    private ArrayList<Usuario> usuarios;
    
    public ListaUsuarios(){
        
    }

    public ListaUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
}
