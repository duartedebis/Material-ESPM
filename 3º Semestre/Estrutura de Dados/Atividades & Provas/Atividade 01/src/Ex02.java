import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    // Faça um algoritmo em linguagem Java para encontrar o maior e o segundo maior elementos de
    // um conjunto (um array). 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de números aleatórios que você deseja gerar na lista(até 1000): ");
        int quantidade = entrada.nextInt();

        int[] lista = new int[quantidade];
        Random aleatorio = new Random();
        
        for (int i = 0; i < lista.length; ) {
            int numeroAleatorio = aleatorio.nextInt(1000);
            boolean existe = false;
            for (int j = 0; j < i; j++) {
                if (lista[j] == numeroAleatorio) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                lista[i] = numeroAleatorio;
                i++;
            }
        }
        
        System.out.println(Arrays.toString(lista));

        int maior = lista[0];
        int segundoMaior = lista[0];

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > maior) {
                segundoMaior = maior;
                maior = lista[i];
            } else if (lista[i] > segundoMaior && lista[i] != maior) {
                segundoMaior = lista[i];
            }
        }

        System.out.println();
        System.out.println("Maior valor: " + maior);
        System.out.println("Segundo maior valor: " + segundoMaior);

        entrada.close();
    }
}
// Grau de complexidade = O(n^2)