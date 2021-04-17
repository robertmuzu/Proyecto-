/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Alexa
 */
public class Perfil {
    
    private int id;
    private String nombrePerfil;
    private String avatarPerfil;

    public Perfil() {
    }

    public Perfil(int id, String nombrePerfil, String avatarPerfil) {
        this.id = id;
        this.nombrePerfil = nombrePerfil;
        this.avatarPerfil = avatarPerfil;
    }

    public String getAvatarPerfil() {
        return avatarPerfil;
    }

    public void setAvatarPerfil(String avatarPerfil) {
        this.avatarPerfil = avatarPerfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }
    
    
}
