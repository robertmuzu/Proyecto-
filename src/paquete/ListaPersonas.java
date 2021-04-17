package paquete;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;

public class ListaPersonas implements Serializable{
    
    private ArrayList<Persona> personas;

    public ListaPersonas(){
        
    }
    
    public ListaPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    
}
