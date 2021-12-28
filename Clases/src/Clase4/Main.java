package Clase4;

public class Main {

    public static void main(String[] args) {

        UsuarioJuego usuarioJuego = new UsuarioJuego("Grego", "root");
 
        usuarioJuego.aumentarPuntaje();
        usuarioJuego.aumentarPuntaje();
        usuarioJuego.subirNivel();
        usuarioJuego.bonus(4);
    }
}
