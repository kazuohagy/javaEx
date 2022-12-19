import java.util.Scanner;
import java.util.ArrayList;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        ArrayList<String> numeros = new ArrayList<String>();

        // Iniciando o vetor
        int[] vetor = { 1, 1, 2, 1, 3, 3, 3, 3, 3, 4, 1, 1, 1, 2, 2, 2, 3, 4, 4, 4 };

        // Imprimindo mensagem
        System.out.println("Frequencia dos numeros \n");
        System.out.print("> [");

        // Variaveis de contador e numero atual ja considerando a primeira posicao do
        // vetor
        int contador = 1;
        int numeroAtual = vetor[0];

        // Atencao que o for comeca da segunda posicao do vetor (indice 1), pois o
        // primeiro
        // ja declaramos ai em cima
        for (int i = 1; i < vetor.length; i++) {
            if (numeroAtual == vetor[i]) { // Se o numero atual for igual a posicao atual, incrementamos a contagem

                contador++;
            }
            // else { // Se nao, imprimimos a contagem total e atualizamos o numero atual e
            // o contador
            // System.out.print("[" + numeroAtual + "," + contador + "], ");
            // numeros.add("[" + numeroAtual + "," + contador + "], ")
            // numeroAtual = vetor[i];
            // contador = 1;
            // }
        }
    }
}