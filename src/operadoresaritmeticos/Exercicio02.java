package operadoresaritmeticos;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /**
         * crie um progama que receba dois numeros inteiro e faça a soma desses numeros
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = entrada.nextInt();

        int soma = n1 + n2;
        System.out.println("Resutado da soma : " + soma);
    }
}
