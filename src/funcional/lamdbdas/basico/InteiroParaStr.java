package funcional.lamdbdas.basico;

import java.util.function.Function;

public class InteiroParaStr {
    public static void main(String[] args) {
        Function<Integer, String> inteiroStr = numero -> "O número é: " + numero;

        System.out.println(inteiroStr.apply(10));
    }
}
