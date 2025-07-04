package atvCursoJavaFeitos.application;

import java.util.Locale;
import java.util.Scanner;

public class mediaPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = scanner.nextInt();

        int[] numeros = new int[n]; // Cria um vetor para armazenar os números inteiros digitados
        int somaPares = 0; // Inicializa a variável que vai guardar a soma dos números pares
        int countPares = 0; // Inicializa o contador para quantos números pares foram digitados

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) { // Verifica se o número é par
                somaPares += numeros[i]; // Soma o número par à variável somaPares
                countPares++; // Incrementa o contador de números pares
            }
        }

        if (countPares > 0) { // Verifica se houve algum número par digitado
            // Calcula a média dos números pares convertendo somaPares para double para divisão com decimal
            double mediaPares = (double) somaPares / countPares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares); // Imprime a média com uma casa decimal
        } else {
            System.out.println("NENHUM NUMERO PAR"); // Imprime mensagem caso nenhum número par tenha sido digitado
        }

        scanner.close();
    }
}