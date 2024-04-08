import java.util.Scanner;

public class Ex03 {
    // Alequinho inventou um conceito novo e o chamou de
    // superdígito. Segundo Alequinho, em sua teoria, o superdígito de um número inteiro y é
    // calculado usando as regras a seguir:
    // I) Se o número y tiver apenas um dígito, seu superdígito será o número y.
    // II) Se o número y tiver mais do que um dígito, o superdígito de y será a soma dos seus dígitos

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        System.out.println("Insira um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println();
            System.out.println("Número inválido");
        } else if (numero < 10) {
            System.out.println();
            System.out.println("Superdígito: " + numero);
        } else {
            int superDigito = 0;
            while (numero > 0) {
                superDigito = numero % 10;
                soma += superDigito;
                numero /= 10;
            }
            System.out.println();
            System.out.println("Superdígito: " + soma);
        }
        entrada.close();
    }
}
// Grau de complexidade = O(1)