package entradadados;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        /**
         * Cria um progama que receba os dados de uma pessoa:
         * Nome completo
         * idade
         * peso
         * altura
         * Genero
         * Ano de nascimento
         * Ao final exiba os dados de forma organizada no console
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
       String nome = entrada.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Qual e o seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Qual e a sua altura: ");
        double altura = entrada.nextDouble();
//        System.out.println("Qual e seu Genero: ");
//        char genero = entrada.nextLine().charAt(0);
        System.out.println("Qual a sua data de nacimento: ");
        int anoDeNascimento = entrada.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
//        System.out.println("Genero: " + genero);
        System.out.println("Ano de nascimento: " + anoDeNascimento);
    }
}
