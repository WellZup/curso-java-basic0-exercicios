package Arrays;

import java.util.Scanner;

// TODO: 10/07/2023 Criar vetores A e B cada um com 10 elementos inteiros.
//  Construir um vetor C, onde cada elemento do vetor C é a soma dos respectivos elementos A e B,
//  ou seja C[i] = A[i]+B[i]
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i ++) {
            System.out.println("Entre com o valor do vetorA " + i);
            vetorA[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetorB.length; i ++) {
            System.out.println("Entre como o valor do vetorB " + i);
            vetorB[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VetorA valor= ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("VetroB valor= ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();

        System.out.println("VetorC valor= ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }


    }
}
