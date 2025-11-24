package funcional.streams;

import java.util.Arrays;
import java.util.List;

import static java.lang.Long.toBinaryString;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        /*
        * 1. Número para String binária... 6 => "110
        * 2. Reverter a string... "110" => "011"
        * 2. Converter de volta para inteiro => "011" => 3
        */

        List<String> binarioString = nums.stream()
                .map(n -> Integer.toBinaryString(n))
                .toList();

        List<Integer> binarioInteiro = binarioString.stream()
                .map(n -> Integer.parseInt(n))
                .toList();

        List<Integer> converterBinario = binarioString.stream()
                .map(n -> Integer.parseInt(toBinaryString(n), 2))
                .toList();

        //Correção:
//        List<Integer> resultado = nums.stream()
//                .map(Integer::toBinaryString)                 // 1. número → binário
//                .map(bin -> new StringBuilder(bin).reverse()) // 2. reverter string
//                .map(sb -> Integer.parseInt(sb.toString(), 2))// 3. binário → inteiro
//                .toList();

//        binarioString.forEach(n -> System.out.println(n.getClass().getSimpleName()));
//        binarioInteiro.forEach(n -> System.out.println(n.getClass().getSimpleName()));

        System.out.println(converterBinario);

    }

    private static String toBinaryString(String n) {
        return n;
    }
}
