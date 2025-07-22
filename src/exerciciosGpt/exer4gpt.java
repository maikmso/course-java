package exerciciosGpt;

import java.util.ArrayList;
import java.util.List;

public class exer4gpt {

    public static void main(String[] args) {

        // 1. Crie um vetor de Strings com nomes (ex: {"Ana", "Beto", "Carlos"}).
        String[] nomes = {"Ana", "Beto", "Carlos"};

        // 2. Crie uma lista vazia.
        List<String> listaNomes = new ArrayList<>();

        // 3. Use for-each para adicionar os elementos do vetor na lista.
        for (String nome : nomes) {
            listaNomes.add(nome);
        }

        // 4. Imprima os nomes da lista
        System.out.println("Nomes da lista: ");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}
