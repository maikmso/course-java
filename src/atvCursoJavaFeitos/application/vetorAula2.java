package atvCursoJavaFeitos.application;

import java.util.Locale;
import java.util.Scanner;

import atvCursoJavaFeitos.entities.vetorrAula2;

public class vetorAula2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        vetorrAula2[] vect = new  vetorrAula2[n];

        for (int i = 0; i < vect.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            vect[i] = new vetorrAula2(name, price);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }

        double media = soma / vect.length;

        System.out.printf("MÉDIA DE PREÇO: %.2f%n ", media);

        scanner.close();
    }
}
