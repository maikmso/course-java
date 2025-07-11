package atvCursoJavaFeitos.application;

public class boxingUnboxingWrapper {

    public static void main(String[] args) {

        // BOXING
        int x = 20;
        // Object obj = x; // Sem wrapper classes
        Integer obj = x; // Com wrapper classes

        // Se colocar Integer(Wrapper Classes) no lugar de Object não precisará fazer um casting.

        System.out.println(obj);

        // UNBOXING
        // int y = (int) obj; // (int) isso é um casting, não precisaria, só apagar | int y = obj;
        int y = obj;  // Sem casting int y = (int) obj;
        System.out.println(y);
    }
}
