import java.util.Scanner;

public class Ex04 {
    // Os alunos deverão implementar o problema do
    // exercício anterior aplicando o conceito de recursividade, além de apresentar a análise de
    // complexidade da função recursiva implementada. 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println();
            System.out.println("Número inválido");
        } else {
            int superDigito = calcularSuperDigito(numero);
            System.out.println();
            System.out.println("Superdígito: " + superDigito);
        }
        entrada.close();
    }

    public static int calcularSuperDigito(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return calcularSuperDigito(calcularSomaDigitos(numero));
        }
    }

    public static int calcularSomaDigitos(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero % 10 + calcularSomaDigitos(numero / 10);
        }
    }
}
// Grau de complexidade = O(1)