package atvCursoJavaFeitos.application;

import java.util.Locale;
import java.util.Scanner;

public class somarVetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define o padrão de localidade para US (usa ponto decimal)
        Scanner scanner = new Scanner(System.in); // Cria Scanner para ler dados do teclado

        int n;

        System.out.print("Quantos valores vai ter em cada vetor? ");
        n = scanner.nextInt(); // Lê do usuário a quantidade de elementos que cada vetor terá

        int[] vetorA = new int[n]; // Cria um vetor A com tamanho n
        int[] vetorB = new int[n]; // Cria um vetor B com tamanho n

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            vetorA[i] = scanner.nextInt(); // Lê e armazena os valores do vetor A
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            vetorB[i] = scanner.nextInt(); // Lê e armazena os valores do vetor B
        }

        int[] vetorSoma = new int[n]; // Cria um vetor para armazenar a soma dos vetores A e B

        for (int i = 0; i < n; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i]; // Soma elemento a elemento e armazena em vetorSoma
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetorSoma[i] + " "); // Exibe os valores somados
        }

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}