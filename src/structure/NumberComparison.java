package structure;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.printf("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.printf("Digite o segundo número: ");
        num2 = sc.nextDouble();

        if (num1 > num2) {
            resultado = num1;
        } else {
            resultado = num2;
        }

        System.out.printf("Entre %.2f e %.2f, o maior número é %.2f.", num1, num2, resultado);

        sc.close();
    }
}
