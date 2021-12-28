package Clase2;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer entradaNumerica;
        boolean resultadoPrimo;
        Integer numeroA;
        Integer numeroB;
        Integer numeroC;
        String string1;
        String texto2;

        System.out.println("Ingrese Numero Para saber si es primo: ");
        entradaNumerica= scanner.nextInt();
        resultadoPrimo= primo(entradaNumerica);
        if (resultadoPrimo==true){
            System.out.println("El numero es Primo \n\n");
        } else {
            System.out.println("El numero no es Primo \n\n");
        }

        //Saber si numero es Mayor
        System.out.println("Ingresa el primer Numero");
        numeroA=scanner.nextInt();
        System.out.println("Ingresa el segundo Numero");
        numeroB=scanner.nextInt();
        System.out.println("Ingresa el tercer Numero");
        numeroC=scanner.nextInt();
        System.out.println("El numero mas grande es: "+numeroMayor(numeroA,numeroB,numeroC)+"\n\n");
        System.out.println("ingrese el primer texto: ");
        string1 = scanner.next();
        System.out.println("ingrese el segundo texto: ");
        texto2 = scanner.next();
        if(cadenaDeTextoDistinta(string1,texto2) == true){
            System.out.println("los textos son diferentes \n\n");
        }
        else{
            System.out.println("los textos son iguales \n\n");
        }
        //mostrarTextos();


    }
    // saber si dos textos son diferentes
    public static void mostrarTextos() {
        Scanner scanner  = new Scanner(System.in);
        String string1, texto2;

        System.out.println("ingrese el primer texto: ");
        string1 = scanner.nextLine();
        System.out.println("ingrese el segundo texto: ");
        texto2 = scanner.nextLine();
        if(cadenaDeTextoDistinta(string1,texto2) == true){
            System.out.println("los textos son diferentes \n\n");
        }
        else{
            System.out.println("los textos son iguales \n\n");
        }
    }
    // METODO NUMERO PRIMO
    public static boolean primo(int numero)
    {
        int resultado = (int)Math.sqrt(numero);
        int esPrimo = 0;
        for(int i = resultado; i > 0; i--)
        {
            if(numero % i == 0 && i != 1){
                esPrimo++;
                break;
            }
        }
        if(esPrimo > 0){
            return false;

        }else
        {
            return true;
        }
    }
    // METODO NUMERO MAYOR
    public static Integer numeroMayor(Integer a, Integer b, Integer c) {
        if (a > b && a > c){
            return a;
        }else if (b > a && b > c){
            return b;
        }else if (c > a && c > b){
            return c;
        } else {
            return a;
        }
    }
    public static boolean cadenaDeTextoDistinta(String string1, String texto2){
        if (string1.equalsIgnoreCase(texto2)){
            return false;
        } else {
            return true;
        }
    }

}






