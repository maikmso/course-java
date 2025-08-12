import java.util.Scanner;

public class matrizAula104 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. ler o tamanho da matriz
        System.out.print("Digite o primeiro número: ");
        int m = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n = sc.nextInt();

        // 2. Criar a matriz e ler os valores
        int[][] mat = new int[m][n];

        System.out.println("Digite os números da matriz abaixo: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // 3. Ler o número X a ser procurado
        System.out.print("Digite o número X a ser procurado na matriz: ");
        int X = sc.nextInt();

        // 4. Percorrer a matriz e procurar X
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == X) {

                    System.out.println("Position: (" + i + ", " + j + ")");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (j < mat[i].length -1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }

                }

            }
        }


        sc.close();
    }
}
