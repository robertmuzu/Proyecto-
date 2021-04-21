/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Comentario implements Serializable {

    private int contadorIdComentario = 0;

    private int idComentario;
    private String nombreUsuario;
    private int calificacion;
    private String comentario;

    public Comentario() {
    }

    public Comentario(String nombreUsuario, int calificacion, String comentario) {
        contadorIdComentario += 1;
        this.idComentario = contadorIdComentario;
        this.nombreUsuario = nombreUsuario;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
