package funcional.lamdbdas.avacado;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = n -> n % 2 == 0
                ? "Par": "Impar";

        Function<String, String> resultado =
                valor -> "O resultado é: " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!";

        String reultFinal = parOuImpar
                .andThen(resultado)
                .andThen(empolgado)
                .apply(32);

        System.out.println(reultFinal);
    }
}
