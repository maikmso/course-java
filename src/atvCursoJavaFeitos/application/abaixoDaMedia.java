package atvCursoJavaFeitos.application;

import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;
        double soma = 0.0;

        System.out.print("Quantos numeros vai ter o vetor? ");
        n = scanner.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i]; // Acumula a soma dos elementos
        }

        double media = soma / n;

        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f%n", media); // Média com 3 casas decimais
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < n; i++) {
            if (numeros[i] < media) { // Verificar se o número do array é menor que a média
                System.out.printf("%.1f%n", numeros[i]); // Imprime apenas os valores abaixo da média, com 1 casa decimal
            }
        }

        scanner.close();
    }
}
