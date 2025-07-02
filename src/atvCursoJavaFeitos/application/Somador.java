package atvCursoJavaFeitos.application;

public class Somador {

    public int somar(int a, int b) {
        return a+b;
    }

    public double somar(double a, double b) {
        return a+b;
    }

    public int somar(int a, int b, int c) {
        return a+b+c;
    }

    // MÉTODOS MAIN PARA TESTAR OS MÉTODOS
    public static void main(String[] args) {
        Somador s = new Somador();

        // TESTES

        System.out.println(s.somar(2,3)); // 5
        System.out.println(s.somar(2.5, 4.5)); // 7.0
        System.out.println(s.somar(1,2,3)); // 6
    }
}
