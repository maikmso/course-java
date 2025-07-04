package atvCursoJavaFeitos.application;

import java.util.Locale;
import java.util.Scanner;

public class numerosPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = scanner.nextInt();

        int[] numeros = new int[n]; // array

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();
        }

        int contPar = 0; // contador de pares

        System.out.println();
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                contPar++;
            }
        }

        System.out.println(); // quebra de linha
        System.out.println(); // quebra de linha
        System.out.println("QUANTIDADE DE PARES: " + contPar);

        scanner.close();
    }
}
