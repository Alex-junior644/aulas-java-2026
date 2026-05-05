package operadoresaritmeticos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /**
         * Cria um progama que calcule u tamanho de uma parede retangular.
         * para realiza o calculo voçe deve utilizar a formular abaixo:
         * area retanglu = altura * comprimento
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite altura da parede: ");
        double altura = entrada.nextDouble();
        System.out.println("Digite o comprimento: ");
        double comprimento = entrada.nextDouble();

        double area = altura * comprimento;
        System.out.println("o tamanho da parede é: " + area);
    }
}
