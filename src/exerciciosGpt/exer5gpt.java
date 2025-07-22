package exerciciosGpt;

public class exer5gpt {

    public static void main(String[] args) {

        // 1. Crie uma variável int numero = 100.
        int numero = 100;

        // 2. Faça o boxing manual: Integer numeroBoxed = Integer.valueOf(numero);
        Integer numeroBoxed = Integer.valueOf(numero); // Boxing manual

        // 3. Faça o unboxing manual: int numeroUnboxed = numeroBoxed.intValue();
        int numeroUnboxed = numeroBoxed.intValue(); // Unboxing manual

        // 4. Imprima todas as variáveis para ver os valores.
        System.out.println(numero);
        System.out.println(numeroBoxed);
        System.out.print(numeroUnboxed);
    }
}
