package funcional.lamdbdas.intermediario;

import java.util.List;

public class ListaTamanhos {
    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Bruno", "Carlos", "Amanda", "Bia");

        List<Integer> tamanho = nomes.stream()
                .map(nome -> nome.length())
                .toList();

        System.out.println(tamanho);

    }
}
