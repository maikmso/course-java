package atvCursoJavaFeitos.application;

import java.util.Locale;
import java.util.Scanner;

public class dadosPessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        // Cria arrays para armazenar as alturas e os gêneros das pessoas
        double[] altura = new double[n];
        char[]  genero = new char[n];

        for (int i = 0; i < n; i++) {

            // Solicita e lê a altura da pessoa i
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            altura[i] = sc.nextDouble();

            sc.nextLine(); // Consumir o \n restante

            // Solicita e lê o gênero da pessoa i (pega o primeiro caractere da linha)
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            genero[i] = sc.next().charAt(0); // Lê 'M' ou 'F'
        }

        // Inicializa as variáveis para armazenar a menor e maior altura com o valor da primeira pessoa
        double menorAltura = altura[0];
        double maiorAltura = altura[0];

        // Variáveis para calcular a soma das alturas das mulheres e contar homens e mulheres
        double somaAlturaMulheres = 0.0;
        int contMulheres = 0;
        int contHomens = 0;

        // Loop para analisar os dados e calcular os valores desejados
        for (int i = 0; i < n; i++) {
            // Atualiza menor altura caso a altura atual seja menor
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }

            // Atualiza maior altura caso a altura atual seja maior
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }

            // Verifica o gênero para atualizar soma e contagem
            if (genero[i] == 'F' || genero[i] == 'f') {
                somaAlturaMulheres += altura[i]; // soma as alturas das mulheres
                contMulheres++; // conta mulheres
            } else if (genero[i] == 'M' || genero[i] == 'm') {
                contHomens++; // conta homens
            }
        }

        // Exibe a menor altura encontrada com duas casas decimais
        System.out.printf("Menor Altura = %.2f%n", menorAltura);

        // Exibe a maior altura encontrada com duas casas decimais
        System.out.printf("Maior Altura = %.2f%n", maiorAltura);

        // Calcula e exibe a média das alturas das mulheres, se houver alguma
        if (contMulheres > 0) {
            double mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
        } else {
            System.out.println("Não há mulheres no grupo.");
        }

        // Exibe a quantidade de homens no grupo
        System.out.println("Numero de homens = " + contHomens);


        sc.close();
    }
}

