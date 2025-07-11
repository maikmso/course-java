package atvCursoJavaFeitos.application;

public class exemplosForEach {

    public static void main(String[] args) {

        String[] frutas = new String[] {"maçã", "banana", "laranja", "uva", "melancia"};

        for (String fruta : frutas) { // Para cada objeto fruta contido no vetor frutas faça!
            String frutaFormatada = fruta.substring(0, 1).toUpperCase() // Pega a primeira letra e transforma em maiúscula
                    + fruta.substring(1).toLowerCase(); // Pega o restante da palavra e transforma em minúscula
            System.out.println(frutaFormatada);
        }
    }
}