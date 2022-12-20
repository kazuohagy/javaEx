import java.util.*;
import java.util.ArrayList;

public class Ex1 {
    public int numero;
    public int frequencia;

    public Ex1(int numero, int frequencia) {
        this.numero = numero;
        this.frequencia = frequencia;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros1 = new ArrayList<Integer>();
        boolean resp = false;
        int numeros, x = 0;
        int vetor[] = new int[10];
        int repetidos[] = new int[10];
        int repetidos1[][] = new int[10][10];
        System.out.println("\n ---->>> Cadastre 10 numeros <<<---- ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros = entrada.nextInt();
            vetor[i] = numeros;
        }

        System.out.println(" ");
        // ordenar vetor
        while (!resp) {
            resp = true;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    resp = false;
                    x = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = x;
                }
            }
        }

        // frequencia dos numeros
        System.out.print("\n Frequencia dos numeros \n");
        int cont = 1;
        int num = 0;
        for (int i = 0; i < vetor.length; i++) {
            cont = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == vetor[i]) {
                    cont++;
                    repetidos[i] = cont;
                }
                num = vetor[i];
            }
        }
        Ex1[] ex1 = new Ex1[10];
        // mostra somente os repetidos
        System.out.println(vetor[0] + " --> " + repetidos[0] + "x.");
        for (int i = 0; i < 9; i++) {
            if (vetor[i] != vetor[i + 1])
                System.out.println(vetor[i + 1] + " --> " + repetidos[i + 1] + "x.");
            ex1[i] = new Ex1(vetor[i + 1], repetidos[i + 1]);
        }
        System.out.println(numeros1);
        System.out.println("ex:" + ex1[0].numero);

        // [[1,5],[2,2],[3,2],[4,1]]
    }
}