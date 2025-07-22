package exerciciosGpt;

import java.util.ArrayList;
import java.util.List;

public class exer3gpt {

    public static void main(String[] args) {

        // 1. Criar uma lista do tipo Integer
        List<Integer> numeros = new ArrayList<>();

        // 2. Adicionar alguns números (ex: 5, 10, 15).
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        // 3. Criar uma varíavel 'soma" do tipo int.
        int soma = 0; // Começa com 0

        // 4. Usar for-each para somar todos os valores (com umboxing automático).
        for (int numero : numeros) {
            soma += numero; // Acumula o valor atual
        }

        // 5. Imprimir o total da soma
        System.out.println("Soma total: " + soma);
    }
}
