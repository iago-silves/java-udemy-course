package funcional.lamdbdas.intermediario;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrdenarPorTamanho {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Carlos", "Bia", "Fernanda");


        nomes.sort(
                (s1, s2) -> Integer.compare(s1.length(),s2.length())
        );

        System.out.println(nomes);

    }
}
