package Arrays;

import java.util.Scanner;

// TODO: 09/07/2023 Criar um vetor A com 8 elementos inteiros. Construr um vetor B de mesmo tipo e tamanho e
//  com elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i]*2.
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int [] vetorA = new int[8];
        int [] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = entrada.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println();
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }



}
