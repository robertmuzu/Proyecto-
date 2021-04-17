package paquete;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CambioImagenProto {

    static int contador = 0;

    public void CambiarFoto() {
        // Clase main

        int velocidad = 1; // segundos

        Timer timer;
        TimerTask tarea;

        int velmil = velocidad * 1000;

        Interfaz.Catalogo catalogo = new Interfaz.Catalogo();
        catalogo.setVisible(true);

        tarea = new TimerTask() {
            @Override
            public void run() {
                Icon icono;

                switch (contador) {
                    case 0:
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/cartelera/007_1.jpg"));
                        catalogo.jLabel1.setIcon(icono);
                        break;
                    case 1:
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/cartelera/blackwidow.jpg"));
                        catalogo.jLabel1.setIcon(icono);
                        break;
                    case 2:
                        contador = 3;
                        icono = new ImageIcon(getClass().getResource("/cartelera/jumanji.jpg"));
                        catalogo.jLabel1.setIcon(icono);
                        break;
                    case 3:
                        contador = 4;
                        icono = new ImageIcon(getClass().getResource("/cartelera/mulan.jpg"));
                        catalogo.jLabel1.setIcon(icono);
                        break;
                    case 4:
                        contador = 5;
                        icono = new ImageIcon(getClass().getResource("/cartelera/onward.jpg"));
                        catalogo.jLabel1.setIcon(icono);
                        break;
                    case 5:
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/cartelera/reinadelsur.jpg"));
                        catalogo.jLabel1.setIcon(icono);
                        break;
                }
            }

        };

        timer = new Timer();

        timer.scheduleAtFixedRate(tarea, velmil, velmil);

        //a
    }
}
