package Arrays;

import java.util.Scanner;

// TODO: 09/07/2023  Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tamanho,
//  sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição,
//  ou seja: B[i]=A[i]*i.
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = entrada.nextInt();
            vetorB[i] = vetorA[i] * i;
        }

        System.out.println();

        System.out.println("Vetor A= ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B= ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();


    }
}
