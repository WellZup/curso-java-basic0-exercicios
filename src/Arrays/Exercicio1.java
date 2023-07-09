package Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

// TODO: 09/07/2023 Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e
//  com os mesmos elementos do vetor A, ou seja B[i] = A[i].
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] vetorA = new int[3];
        double [] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = entrada.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(df.format(vetorB[i]) + " ");
        }

    }
}
