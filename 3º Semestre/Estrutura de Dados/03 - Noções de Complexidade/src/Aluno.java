import java.util.Random;

public class Aluno {
    // definir atributos ou propriedades ou variáveis de instância

    int ra;
    String nome = new String();
    double nota1;
    double nota2;

    public Aluno( String nome, double nota1, double nota2) {
        Random rd = new Random();
        ra = rd.nextInt(1000, 10000); // gera um número aleatório
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // método para calcular e retornar a média do aluno

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // método para verificar se o aluno foi aprovado ou reprovado

    public boolean verificar() {
        return calcularMedia() >= 7 ? true : false;
    }
}