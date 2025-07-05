package atvCursoJavaFeitos.application;

import java.util.Locale;
import java.util.Scanner;

public class maisVelho {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        // Cria dois vetores: um para nomes e outro para idades
        String [] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha
        }

        // Inicializa a maior idade e a posição correspondente
        int maisVelho = idades[0];
        int posicaoMaisVelho = 0;

        // Percorre o vetor de idades para encontrar a maior idade
        for (int i = 1; i < n; i++) {
            if (idades[i] > maisVelho) {
                maisVelho = idades[i]; // Atualiza a maior idade
                posicaoMaisVelho = i; // Guarda o índice dessa pessoa
            }
        }

        // Imprime o nome da pessoa mais velha usando o índice encontrado
        System.out.println("PESSOA MAIS VELHA: " + nomes[posicaoMaisVelho]);

        scanner.close();
    }
}
