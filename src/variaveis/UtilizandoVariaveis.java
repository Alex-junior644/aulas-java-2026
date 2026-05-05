package variaveis;

public class UtilizandoVariaveis {
    public static void main(String[] args) {
        //Variaveis Primitivas do java.
        /*
         * Variavel do Tipo Texto - String
         * Variavel do Tipo Numero Inteiro - int
         * Variavel do Tipo Numero Decimal - double
         * Variavel do Tipo Caracter - char
         * Variavel do Tipo Booleana - boolean (Verdadeiro = true, Falso = false)
         * */

        // Variavel do Tipo String.
        String nomePessoa = "Alex Junior gomes dos Santos";
        String mensagemBomDia = "Bom dia, " + nomePessoa + "!";
        System.out.println("Nome da Pessoa: " + nomePessoa);
        System.out.println(mensagemBomDia);

        System.out.println(mensagemBomDia);

        // variavel do tipo int
        int numero = 32;
        System.out.println("Exibindo um numero inteiro: " + numero);

        // variavel do Tipo double
        double altura = 1.70;
        System.out.println("Exibindo um numero decimal: " + altura);

        // variavel do Tipo char
        char letra = 'A';
        System.out.println("Exibindo um caracter: " + letra);

        // variavel do Tipo boolean
        boolean ativo = true;
        System.out.println("Exibindo um booleano: " + ativo);
    }

}
