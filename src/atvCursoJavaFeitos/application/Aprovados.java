package atvCursoJava.applicationn;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();  // Por exemplo: 4

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            sc.nextLine(); // limpar o buffer
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            double media = (nota1[i] + nota2[i]) / 2.0;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}

