package exerciciosGpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer6gpt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1. Crie uma lista de Integer.
        List<Integer> numeros = new ArrayList<>();

        // 2. Peça para o usuário digitar quantos números ele quer adicionar
        System.out.print("Quantos números você quer adicionar? ");

        // 3. Leia os números com Scanner e adicione na lista (aqui, o autoboxing vai acontecer)
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = sc.nextInt(); // Lê o número
            numeros.add(numero); // autoBoxing: int -> Integer
        }

        // 4. Somar todos os valores usando for-each
        int soma = 0;
        for (int num : numeros) { // auto-unboxing: Integer -> int
            soma += num;
        }
        System.out.println();

        // 5. Ao final mostre a soma total
        System.out.println("Soma total: " + soma);

        sc.close();
    }
}
