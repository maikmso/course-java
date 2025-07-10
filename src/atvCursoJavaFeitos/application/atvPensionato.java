package atvCursoJavaFeitos.application;

import atvCursoJava.entitiess.estudantePensionato;

import java.util.Locale;
import java.util.Scanner;

public class atvPensionato {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do teclado (consome a quebra de linha pendente)
        System.out.println();

        estudantePensionato[] quartos = new estudantePensionato[10]; // array de 10 quartos (0 a 9)

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine(); // Lê o nome do estudante

            System.out.print("Email: ");
            String email = sc.nextLine(); // Lê o email do estudante

            System.out.print("Room: ");
            int room = sc.nextInt(); // Lê o número do quarto escolhido
            sc.nextLine(); // Limpa o buffer (descarta o Enter deixado pelo nextInt)

            // Instancia o objeto estudantePensionato e guarda no quarto escolhido
            quartos[room] = new estudantePensionato(name, email);

            System.out.println(); // Linha em branco para organizar a saída
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}