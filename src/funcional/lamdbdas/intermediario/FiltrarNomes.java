package funcional.lamdbdas.intermediario;

import java.util.List;

public class FiltrarNomes {
    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Bruno", "Carlos", "Amanda", "Bia");


//        for(String nome: nomes){
//            char primeiraLetra = nome
//                    .toUpperCase()
//                    .charAt(0);
//
//            if(primeiraLetra == 'A'){
//                System.out.println(nome);
//            }
//        }
//
        List<String> nomesComA = nomes.stream()
                .filter(nome -> nome.toUpperCase().charAt(0) == 'A')
                .toList();

        System.out.println(nomesComA);

    }
}
