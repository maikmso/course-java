package atvCursoJavaFeitos.application;

import java.util.Locale;
import java.util.Scanner;

public class atvVetor2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = scanner.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextDouble();
        }
        System.out.println();

        System.out.print("VALORES: ");

        for (int i = 0; i < n; i++) {
            System.out.print(vect[i] + " ");
        }
        System.out.println();

        soma = 0.0;

        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        System.out.printf("SOMA = %.2f%n", soma);

        media = soma / n;

        System.out.printf("MEDIA = %.2f%n", media);

        scanner.close();
    }
}
