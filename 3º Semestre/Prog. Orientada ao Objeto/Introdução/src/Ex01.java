// Se listarmos todos os números naturais abaixo de 10 que são múltiplos de 3 e 5, nós obtemos 3,
// 5, 6 e 9. A soma desses valores é 23. Escreva um programa em Java que encontre a soma de
// todos os múltiplos de 3 e 5 abaixo de 1000.

public class Ex01 {
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
