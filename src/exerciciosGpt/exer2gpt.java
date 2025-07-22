package exerciciosGpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer2gpt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Criar uma lista de Strings
        List<String> frutas = new ArrayList<>();

        // Adiciona elementos na lista
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Impimre todos os elementos
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        sc.close();
    }
}
