package atvCursoJavaFeitos.application;

import java.util.Locale;
import java.util.Scanner;

import atvCursoJavaFeitos.entities.aatvVetor3;

public class atvVetor3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define o padrão de localidade para o formato americano (ponto decimal)
        Scanner scanner = new Scanner(System.in); // Cria um scanner para ler dados do teclado

        int n; // Número de pessoas que serão digitadas
        double media, porcentagemMenores; // Variáveis para armazenar a média das alturas e % de menores de 16 anos

        System.out.print("Quantas pessoas serao digitadas? ");
        n = scanner.nextInt(); // Lê a quantidade de pessoas
        scanner.nextLine(); //  Consumir a quebra de linha após o nextInt();

        aatvVetor3[] vetor = new aatvVetor3[n]; // Cria um array para armazenar os objetos aatvVetor3

        // Loop para ler os dados de cada pessoa
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a" + " pessoa: ");
            System.out.print("Nome: ");
            String name = scanner.nextLine(); // Lê o nome

            System.out.print("Idade: ");
            int age = scanner.nextInt(); // Lê a idade

            System.out.print("Altura: ");
            double height = scanner.nextDouble(); // Lê a altura
            scanner.nextLine(); // Consome a quebra de linha após o nextDouble();

            vetor[i] = new aatvVetor3(name, age, height); // Cria um objeto com os dados e adiciona no vetor
        }

        // Calcula a média das alturas usando o metodo estático da classe aatvVetor3
        media = aatvVetor3.calcularMediaAlturas(vetor);
        System.out.printf("%nAltura média: %.2f%n", media); // Imprime a média formatada com 2 casas decimais

        // Calcula a porcentagem de pessoas com menos de 16 anos usando metodo estático
        porcentagemMenores = aatvVetor3.calcularPorcentagemMenosDe16(vetor);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores); // Imprime a porcentagem

        scanner.close(); // Fecha o scanner para liberar o recurso
    }
}
