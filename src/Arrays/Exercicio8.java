package Arrays;

import java.util.Scanner;

// TODO: 10/07/2023 Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetorC,
//  onde cada elemento de C é a multiplicação dos respectivos elementos em A e B,
//  ou seja: C[i] = A[i]*B[i]
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetorA = new int[3];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetorA posição: " +i);
            vetorA[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o valor do vetorB posição: " +i);
            vetorB[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i]*vetorB[i];
        }

        System.out.println("Valor do vetorA: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Valor do vetorB: ");
        for (int i =0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println(

        );
        System.out.println("Valor do vetorC: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
