package funcional.lamdbdas.basico;

import java.util.function.Consumer;

public class lambSaudacao {
    public static Consumer<String> saudacao = nome -> System.out.println("Seja bem-vindo: " + nome);

    public static void main(String[] args) {
        saudacao.accept("Iago Silvestre.");
    }
}
