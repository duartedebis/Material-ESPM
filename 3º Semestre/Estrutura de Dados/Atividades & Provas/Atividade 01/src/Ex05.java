import java.util.Scanner;

public class Ex05 {
    // Escreva um programa em Java que leia um valor inteiro e positivo via teclado. O seu programa
    // deverá ter uma função recursiva para converter o valor para a base binária e retornar

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um número inteiro e positivo: ");
        int decimal = entrada.nextInt();

        if (decimal < 0) {
            System.out.println();
            System.out.println("Número inválido, insira um número inteiro e positivo: ");
        } else {
            String binario = converterParaBinario(decimal);
            System.out.println();
            System.out.println("O número " + decimal + " em binário é: " + binario);
        }
        entrada.close();
    }

    public static String converterParaBinario(int decimal) {
        if (decimal == 0) {
            return "";
        } else {
            String binario = converterParaBinario(decimal / 2);
            int resto = decimal % 2;
            return binario + resto;
        }
    }
}
// Grau de complexidade = O(1)