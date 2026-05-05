package entradadados;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite o nome da sua Cidade: ");
        String cidade = entrada.nextLine();
        System.out.println("\nDigite o cepe da rua: ");
        String cep = entrada.nextLine();
        System.out.println("\nDigite o numero da sua Caza: ");
        int numeroDaSuaCaza = entrada.nextInt();
        System.out.println("Cidade: " + cidade);
        System.out.println("Cep " + cep);
        System.out.println("Numero da sua caza: " + numeroDaSuaCaza);
    }
}
