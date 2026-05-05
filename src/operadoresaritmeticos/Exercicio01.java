package operadoresaritmeticos;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo Numero: ");
        int n2 = entrada.nextInt();

        int soma = n1 + n2;
        System.out.printf("Soma %d + %d = %d", n1, n2, soma);

        int subtracao = n1 - n2;
        System.out.printf("\nSubtração %d - %d = %d", n1, n2, subtracao);

        int multiplicacao = n1 * n2;
        System.out.printf("\nMultiplicação %d * %d = %d", n1, n2, multiplicacao);

//         int n2 = 56;
//        int n3 = 4;
//
//        System.out.println("Soma: " + (n2 + n3));
    }
}