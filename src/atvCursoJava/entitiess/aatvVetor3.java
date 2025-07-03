package atvCursoJava.entitiess;

public class aatvVetor3 {

    private String name;   // Nome da pessoa
    private int age;       // Idade da pessoa
    private double height; // Altura da pessoa

    // Construtor para criar objeto com nome, idade e altura
    public aatvVetor3(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Getter para o nome
    public String getName() {
        return name;
    }

    // Getter para a idade
    public int getAge() {
        return age;
    }

    // Getter para a altura
    public double getHeight() {
        return height;
    }

    // Método estático para calcular a média das alturas no vetor de objetos
    public static double calcularMediaAlturas(aatvVetor3[] vetor) {
        double soma = 0.0;
        // Percorre cada objeto no vetor somando as alturas
        for (aatvVetor3 pessoa : vetor) { // 'pessoa' é variável temporária que representa cada objeto no vetor
            soma += pessoa.getHeight(); // Soma a altura usando o getter

            /* OUTRO MÉTODO DE FAZER ESSE FOR:
            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i].getHeight();
            }
            */
        }

        return soma / vetor.length; // Retorna a média calculada dividindo a soma pelo número de elementos
    }

    // Método estático para calcular a porcentagem de pessoas com menos de 16 anos
    public static double calcularPorcentagemMenosDe16(aatvVetor3[] vetor) {
        int count = 0; // Contador para pessoas com menos de 16 anos
        for (aatvVetor3 pessoa : vetor) { // 'pessoa' é variável temporária
            if (pessoa.getAge() < 16) { // Chama o getter para idade e verifica condição
                count++;
            }
        }

        // Calcula e retorna a porcentagem com base no total de pessoas
        return (count * 100.0) / vetor.length;
    }
}
