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
    PELICULAS(1),
    DOCUMENTALES(2),
    SERIES(3),
    INFANTILES(4),
    NOVELAS(5),
    ESTRENOS(6),
    OTROS(7);

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
