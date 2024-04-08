// Cada novo termo na sequência de Fibonacci é gerado adicionando os dois termos anteriores. Ao
// começar com 1 e 2, os 10 primeiros termos serão: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .... Considerando
// os termos da sequência de Fibonacci cujos valores não excedem quatro milhões, escreva um
// programa em Java que encontre a soma dos termos de valor par. (resposta = 4613732 ).

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("Exercícios Selmini");
    }
    public static void Exercicio() {
        System.out.println("Exercício 01");
        int soma = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0);
                soma += i;
        }
        System.out.println("Soma: " + soma);
    }
}

