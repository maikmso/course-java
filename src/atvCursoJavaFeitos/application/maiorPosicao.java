package atvCursoJavaFeitos.application;

import java.util.Locale;
import java.util.Scanner;

public class maiorPosicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = scanner.nextInt();

        double[] numeros = new double[n]; // array

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextDouble();
        }

        double maiorNumero = numeros[0]; // Inicializa o maior número com o primeiro elemento do array
        int posicaoMaior = 0; // Inicializa a posição do maior número com 0 (primeira posição)

        // Loop para encontrar o maior número e sua posição no array
        for (int i = 1; i < n; i++) {
            // Se o número atual for maior que o maior já encontrado
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i]; // Atualiza o maior número
                posicaoMaior = i; // Atualiza a posição do maior número
            }
        }

        System.out.println(); // Imprime uma linha em branco para separar a saída

        // Exibe o maior número formatado com 1 casa decimal
        System.out.printf("MAIOR VALOR = %.1f%n", maiorNumero);

        // Exibe a posição (índice) do maior número do array
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);

        scanner.close();
    }
}
