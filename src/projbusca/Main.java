package projbusca;

import java.util.Scanner;

public class Main {

    public static boolean buscador (int number , int [] vetor){
        for ( int i=0; i < vetor.length ; i++){
            if ( number == vetor[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int [10];

        for (int i = 0; i < 10 ; i++){
            System.out.println("Digite o " +( i + 1 ) + " º elemento");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Digite o elemento  a ser buscado");
        int number =  teclado.nextInt();

        System.out.println( buscador(number, numeros));
    }
}
