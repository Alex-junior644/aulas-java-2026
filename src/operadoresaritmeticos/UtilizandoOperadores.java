package operadoresaritmeticos;

public class UtilizandoOperadores {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 4;

        // adição +cm
        System.out.println("Soma: " + (n1 + n2));
        int soma = n1 + n2;
        System.out.printf("A soma do %d + %d = %d", n1, n2, soma);

        // subtração -
        System.out.println("\nSubtração: " + (n1 - n2));

        // Multiplicação *
        System.out.println("Multiplicação: " + (n1 * n2));

        // divisão /
        System.out.println("Divisão: " + (n1 / n2));
        System.out.println("Divisão com conversão: " + (n1 / (double)n2)); //convertendo a variavel n2 em double isso se chama casting
        double n3 = n2;

                // modulo (restor da divisao) %
        System.out.println("Modulo: " + (n1 % n2));
    }
}
