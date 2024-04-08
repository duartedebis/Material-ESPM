import java.util.Scanner;

public class Ex01 {
    // Alice está organizando uma biblioteca com 𝑛 estantes, cada uma contendo 𝑛 livros. Você deverá
    // desenvolver um algoritmo para facilitar a busca por um livro específico. O algoritmo deverá
    // percorrer cada estante em busca de um livro desejado. O processo continua até que o livro seja
    // encontrado ou todas as estantes tenham sido verificadas. 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Insira o número de estantes: "); 
        int numEstantes = entrada.nextInt(); 

        System.out.println(); 
        System.out.println("Insira o número de livros em cada estante: ");
        int numLivrosPorEstante = entrada.nextInt(); 

        int[][] estantes = new int[numEstantes][numLivrosPorEstante];

        for (int i = 0; i < numEstantes; i++) { 
            for (int j = 0; j < numLivrosPorEstante; j++) {
                estantes[i][j] = i * numLivrosPorEstante + j;
            }
        }

        System.out.println(); 
        System.out.println("Conteúdo da matriz estantes:"); 
        for (int i = 0; i < numEstantes; i++) {
            for (int j = 0; j < numLivrosPorEstante; j++) {
                System.out.print(estantes[i][j] + " ");
            }
            System.out.println(); 
        }

        System.out.println(); 
        System.out.println("Insira o número do livro desejado: "); 
        int livroDesejado = entrada.nextInt(); 

        boolean livroEncontrado = false; 

        for (int i = 0; i < numEstantes; i++) { 
            for (int j = 0; j < numLivrosPorEstante; j++) {
                if (estantes[i][j] == livroDesejado) { 
                    livroEncontrado = true;
                    System.out.println(); 
                    System.out.println("Livro encontrado na estante " + (i + 1) + " na posição " + (j + 1)); //Somamos 1 para ficar mais intuitiva a leitura já que o array começa em 0
                    break; 
                }
            }
            if (livroEncontrado) { 
                break; 
            }
        }

        if (!livroEncontrado) { 
            System.out.println(); 
            System.out.println("Livro não encontrado, todas as estantes foram verificadas");
        }
        entrada.close(); 
    }
}
// Grau de complexidade = O(n^2)