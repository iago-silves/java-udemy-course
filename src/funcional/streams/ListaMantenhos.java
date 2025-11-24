package funcional.streams;

import java.util.List;

public class ListaMantenhos {
    public static void main(String[] args) {
        List<String> palavras = List.of("Java", "Stream", "Lambda", "API");

        List<Integer> tamanho = palavras.stream()
                .map(n -> n.length())
                .toList();

        tamanho.forEach(System.out::println);
    }
}
