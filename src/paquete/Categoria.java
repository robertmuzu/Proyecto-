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
public enum Categoria {
    PELICULAS(0),
    DOCUMENTALES(1),
    SERIES(2),
    INFANTILES(3),
    NOVELAS(4),
    ESTRENOS(5),
    OTROS(6);

    private final int codigoCategoria;

    private Categoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public static Categoria get(int id) {
        for (Categoria e : values()) {
            if (e.codigoCategoria == id) {
                return e;
            }
        }
        return OTROS;
    }

}
