package funcional.lamdbdas.basico;

import java.util.List;
import java.util.function.Predicate;

public class VerficarPar {

    public static void main(String[] args) {
        Predicate<Integer> verificarPar = n -> n % 2 == 0;

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> pares = numeros.stream()
                .filter(verificarPar)
                .toList();

        System.out.println(pares);
    }

}
