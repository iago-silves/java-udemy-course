package structure;

import java.util.Scanner;

/*
Exercício Controle 2 – Conversão de Base Numérica
Leia um número inteiro e uma opção de conversão: binário, octal ou hexadecimal.
Utilize `switch` ou `if/else`.
*/
public class NumberBaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        int numero = 0;

        while (true) {
            System.out.printf("""
                    Menu de conversão:
                        1. Binário
                        2. Octal
                        3. Hexadecimal
                        4. Sair
                    """);

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextLine();

            if (opcao.equals("4")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.print("Digite um número inteiro: ");
            try {
                numero = sc.nextInt();
                sc.nextLine(); // limpa o buffer
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                sc.nextLine(); // limpa o erro
                continue;
            }

            switch (opcao) {
                case "1" -> {
                    String bin = Integer.toBinaryString(numero);
                    System.out.println("O número " + numero + " em binário é: " + bin);
                }
                case "2" -> {
                    String octal = Integer.toOctalString(numero);
                    System.out.println("O número " + numero + " em octal é: " + octal);
                }
                case "3" -> {
                    String hex = Integer.toHexString(numero);
                    System.out.println("O número " + numero + " em hexadecimal é: " + hex);
                }
                default -> System.out.println("Opção inválida! Escolha de 1 a 4.");
            }

            System.out.println(); // espaçamento
        }

        sc.close();
    }
}
