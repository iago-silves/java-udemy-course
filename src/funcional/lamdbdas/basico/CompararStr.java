package funcional.lamdbdas.basico;

import java.util.function.BiPredicate;

public class CompararStr {
    public static void main(String[] args) {
        BiPredicate<String, String> comparar = (palavra1, palavra2) -> palavra1.equals(palavra2);

        boolean resultado = comparar.test("Olá", "Olá"); // true
        boolean resultado1 = comparar.test("hello", "Olá"); // false

        System.out.println(resultado);
        System.out.println(resultado1);
    }
}
