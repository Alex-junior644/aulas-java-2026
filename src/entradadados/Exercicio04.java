package entradadados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // entrada de dados.
        System.out.println("Digite ceu nome: ");
        String nome = entrada.nextLine();

//        System.out.println("Vocé digitou: " + nome);
        System.out.println("digite sua idade: ");
        int idade = entrada.nextInt();

        // saida de dados.
        System.out.println("\nOlá " + nome + ", você tem " + idade + " anos.");
    }
}
