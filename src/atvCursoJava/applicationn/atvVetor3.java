package atvCursoJava.applicationn;

import java.util.Locale;
import java.util.Scanner;

public class atvVetor3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        sc.close();
    }
}
