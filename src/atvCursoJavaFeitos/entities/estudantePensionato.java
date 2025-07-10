package atvCursoJava.entitiess;

public class estudantePensionato {

    private String name;
    private String email;

    public estudantePensionato(String name, String email) {  // nome do parâmetro corrigido para 'name'
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + ", " + email;
    }
}