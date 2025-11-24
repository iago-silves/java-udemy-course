package funcional.streams;

import java.util.Collections;
import java.util.List;

public class SomarItensLista {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 5, 7, 1, 8, 4);

        List<Integer> somar = Collections.singletonList(numeros.stream()
                .reduce(0, (acumulador, numero) -> acumulador + numero));

        System.out.println(somar);
    }
}
