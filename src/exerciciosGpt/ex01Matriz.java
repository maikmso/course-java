package exerciciosGpt;

import java.util.Scanner;

public class ex01Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat3x3 = new int[3][3];

        System.out.println("Preencha a matriz com os valores: ");
        for (int i = 0; i < mat3x3.length; i++) {
            for (int j = 0; j < mat3x3[i].length; j++) {
                mat3x3[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matriz 3x3 preenchida: ");
        for (int i = 0; i < mat3x3.length; i++) {
            for (int j = 0; j < mat3x3[i].length; j++) {
                System.out.print(mat3x3[i][j] + "\t"); // \t = tabulação
            }
            System.out.println(); // quebra de linha a cada nova linha da matriz
        }

        int somaDiagonal = 0;

        System.out.println();
        System.out.println("Soma da diagonal principal de uma matriz 3x3: ");
        for (int i = 0; i < mat3x3.length; i++) {
            somaDiagonal += mat3x3[i][i]; // diagonal principal: [0][0], [1][1], [2][2].
        }

        System.out.println("Elementos da diagonal principal: ");
        for (int i = 0; i < mat3x3.length; i++) {
            System.out.print("[" + i + "][" + i + "] = " + mat3x3[i][i] + "\n");
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonal);

        sc.close();
    }
}