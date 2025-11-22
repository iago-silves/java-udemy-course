package funcional.lamdbdas.basico;

import java.util.function.BiFunction;

public class SomaComBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> somarNumeros = (n1, n2) -> n1 + n2;

        System.out.println(somarNumeros.apply(10, 2));
    }
}
