package Arrays;

import java.util.Scanner;

// TODO: 10/07/2023  Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
//  sendo que cada elemento do vetor B deverá se o resto da divisão do respectivo de A por 2.
//  Ou seja B[i] = A[i] % 2
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[4];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetorA posição "+i);
            vetorA[i] = entrada.nextInt();

            vetorB[i] = vetorA[i] % 2;
        }

        System.out.println("Valor do vetorA: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Valor do vetorB: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

    }
}
