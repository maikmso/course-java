package atvCursoJavaFeitos.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aprendendoList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // Para adicionar uma nova informação na posição que quiser.

        System.out.println(list.size()); // Como saber o tamanho da lista

        for (String x : list) { // Para cada objeto 'x', ':' = pertencente a list faça:
            System.out.println(x);
        }

        System.out.println("----------------------");
        // list.remove("Anna"); // Remover com camparação de valor
        // list.remove(1); // Remover por posição
        list.removeIf(x -> x.charAt(0) == 'M'); // Remover predicado inicial igual
        for (String x : list) { // Para cada objeto 'x', ':' = pertencente a list faça:
            System.out.println(x);
        }
        System.out.println("----------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // Encontrar posição de um elemento
        System.out.println("Index of Bob: " + list.indexOf("Marco")); // Encontrar alguém que não esteja na lista = retorna -1
        System.out.println("----------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        /* stream não é compatível com list então precisamos:
        transformar a list em stream() = list.stream(),
        fazemos a operação em lambda = .filter(operação)
        e depois precisamos voltar ele para list = .collect(Collectors.toList());
        */
        for (String x : result) { // Para cada objeto 'x', ':' = pertencente a list faça:
            System.out.println(x);
        }

        System.out.println("----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        /*
            .findFirst() = Encontrar o primeiro elemento da lista com a Inicial letra A
            .orElse(null); = se não encontrar ninguém na lista com a inicial desejada retornará null
        */

        System.out.println(name);

    }
}