package string;

import java.util.Scanner;

public class PegarVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vogais = {"A", "E", "O", "I", "U"};
        String nome;
        String vogalNome;
        int i = 0;

        System.out.printf("Digite seu nome: ");
        if(sc.hasNext()){
            nome = sc.nextLine();

            for(String vogal: vogais){
                vogalNome = nome.toUpperCase().charAt(i++) + "";
                if(vogalNome.strip().equals(vogal)){
                    System.out.println(vogal);

                }else {
                    System.out.println("Nenhuma vogal presente.");
                }
            }
        }else{
            System.out.println("Erro: Digite um número válido.");
        }

        sc.close();
    }
}
