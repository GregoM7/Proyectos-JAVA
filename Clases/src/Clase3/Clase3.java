package Clase3;

import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gamer1;
        String gamer2;
        Integer piedra = 1;
        Integer papel = 2;
        Integer tijera = 3;
        Integer eleccionGamer1;
        Integer eleccionGamer2;
        System.out.println("Elegi Piedra(1), Papel(2), Tijera(3)");
        eleccionGamer1 = scanner.nextInt();
        System.out.println("Elegi Piedra(1), Papel(2), Tijera(3)");
        eleccionGamer2 = scanner.nextInt();
        //System.out.println(eleccionGamer1 + eleccionGamer2);
        cualGana(eleccionGamer1,eleccionGamer2);



    }
    public static void cualGana(int eleccion1, int eleccion2 ) {
        Integer acumuladorGamer1 = 0;
        Integer acumuladorGamer2 = 0;
        if (eleccion1 == eleccion2){
            System.out.println("Esto es un Empate");
        } if ((eleccion1 == 1 && eleccion2 == 3) ||
                (eleccion1 == 2 && eleccion2 == 1) || (eleccion1 == 3 && eleccion2 == 2)){
            acumuladorGamer1+= 1;
        }
    }
}

