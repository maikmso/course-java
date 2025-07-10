package atvCursoJava.applicationn;

import java.util.Locale;
import java.util.Scanner;

public class atvPensionato {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many rooms will be rented? ");
        n = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do teclado (consome a quebra de linha pendente)
        System.out.println();

        // Arrays para armazenar os dados dos estudantes
        String[] name = new String[n]; // Nome dos estudantes
        String[] email = new String[n]; // Email dos estudantes
        int[] room = new int[n]; // Número dos quartos alugados

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");

            System.out.print("Name: ");
            name[i] = sc.nextLine(); // Lê o nome do estudante

            System.out.print("Email: ");
            email[i] = sc.nextLine(); // Lê o email do estudante

            System.out.print("Room: ");
            room[i] = sc.nextInt(); // Lê o número do quarto escolhido
            sc.nextLine(); // Limpa o buffer (descarta o Enter deixado pelo nextInt)

            System.out.println(); // Linha em branco para organizar a saída
        }

        // Impressão dos quartos ocupados em ordem crescente
        System.out.println("Busy rooms: ");
        for (int i = 0; i <= 9; i++) { // Percorre  todos os quartos possíveis // i = número do quarto ( 0 a 9 )
            for (int j = 0; j < n; j++) { // Verifica todos os estudantes cadastrados
                if (room[j] == i) { // Se o estudante 'j' alugou o quarto 'i'
                    System.out.println(i + ": " + name[j] + ", " + email[j]);
                    break; // Sai do loop interno porque o quarto já foi encontrado
                }
            }
        }
        sc.close();
    }
}