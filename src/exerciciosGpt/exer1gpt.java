package exerciciosGpt;

import java.util.Scanner;

public class exer1gpt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Passos:
        1. Criar um vetor de 5 posições.
        2. Preencher o vetor com valores (ex: 10, 20, 30, 40, 50).
        3. Imprimir usando for tradicional.
        4. Imprimir usando for-each.
         */

        // Criar um vetor de 5 posições
        int[] numeros = new int[5];

        // Preencher o vetor com valores digitados pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        // Imprimir com for tradicional
        System.out.println();
        System.out.println("Impressão com for tradicional: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        // Imprimir com for-each
        System.out.println();
        System.out.println("Impressão com for-each: ");
        for (int numero : numeros) {
            System.out.println("Valor: " + numero);
        }

        sc.close();
    }
}
