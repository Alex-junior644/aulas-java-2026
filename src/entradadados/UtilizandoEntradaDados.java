package entradadados;

import java.util.Scanner;

public class UtilizandoEntradaDados {
    public static void main(String[] args) {
        // Criando a entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: "); // Aqui estar exibindo somente o texto de interaçao
        String nome = entrada.nextLine(); // Aqui avariavel nome estar recebendo o valor digitado e convertido em String.

        System.out.println("Voçe digitou: " + nome); // Aqui estar exibindo informação de saida de dados

        // entrada de dados do tipo numeros inteiros
        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Minha idade: " + idade);

        // entrada de dados do tipo numeros decimais
        System.out.println("Digite a sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Minha altura: " + altura);
    }
}
