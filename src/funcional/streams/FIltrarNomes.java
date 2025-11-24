package funcional.streams;

import java.util.List;

public class FIltrarNomes {
    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Bruno", "Carla", "Daniel", "Bia", "Roberto");

        List<String> filtro = nomes.stream()
                .filter(n -> n.length() < 4)
                .toList();

        System.out.println(filtro);

    }
}
