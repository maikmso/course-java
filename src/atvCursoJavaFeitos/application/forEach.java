package atvCursoJavaFeitos.application;

public class forEach {

    public static void main(String[] args) {

        String[] vetor = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("------------------------");
        for (String obj : vetor) { // Para cada objeto obj contido no vetor faça!
            System.out.println(obj);
        }
    }
}
