// Escreva um programa em Java que calcule o máximo divisor comum (MDC) entre
// dois valores inteiros usando a fórmula de recursão mostra a seguir.

import java.util.Scanner;

public class CalcularMDC {
    public static void main(String[] args) {

        int m, n;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de m: ");
        m = teclado.nextInt();

        System.out.println("Digite o valor de n: ");
        n = teclado.nextInt();

        int mdc = calcularMDC(m, n);
        System.out.println("O MDC entre " + m + " e " + n + " é " + mdc + ".");

    }

    private static int calcularMDC(int m, int n) {
        if (n > m) {
            return calcularMDC(n, m);
        } else if (n == 0) {
            return m;
        } else {
            return calcularMDC(n, m % n);
        }
    }
}