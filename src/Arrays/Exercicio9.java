package Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

// TODO: 10/07/2023  Criar dois valores A e B cada um com 10 elementos inteiros. Construir um vetor C,
//  onde cada elemento de C é a divisão dos respectivos elementos A e B, ou seja C[i] = A[i]/B[i].
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetorA na posição: "+i);
            vetorA[i] = entrada.nextInt();
        }

        System.out.println();

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o valor do vetorB na posição: "+i);
            vetorB[i] = entrada.nextInt();
        }

        System.out.println();

        for (int i = 0; i < vetorC.length; i ++) {
            vetorC[i] = vetorA[i]/vetorB[i];
        }

        System.out.println("Valor do vetorA ");
        for (int i =0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Valor do vetorB ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("Valor do vetorC ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(df.format(vetorC[i]) + " ");
        }
    }
}
