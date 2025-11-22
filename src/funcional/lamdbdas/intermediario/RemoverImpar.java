package funcional.lamdbdas.intermediario;

import java.util.ArrayList;
import java.util.List;

public class RemoverImpar {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(
                List.of("Ana", "Bruno", "Carlos", "Amanda", "Bia")
        );

        nomes.removeIf(
                n -> n.length() % 2 == 0
        );

        System.out.println(nomes);
    }
}
