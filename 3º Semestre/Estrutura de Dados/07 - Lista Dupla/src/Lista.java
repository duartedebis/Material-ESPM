public class Lista {
    No inicio, fim; // inicializa em null
    int tamanho; // inicializa em 0

    // método para inserir um elemento no final da lista
    public void inserirFinal(String nome, int ra) {
        No aux = new No(nome, ra);
        if (tamanho == 0) { // ou inicio == null
            inicio = aux;
            fim = aux;
        } else {
            fim.direita = aux;
            aux.esquerda = fim;
        }
        fim = aux;
        tamanho++;
    }

    // método para inserir um elemento no início da lista
    public void inserirInicio(String nome, int ra) {
        No aux = new No(nome, ra);
        if (tamanho == 0) { // ou inicio == null
            inicio = aux;
            fim = aux;
        } else {
            inicio.esquerda = aux;
            inicio = aux;
        }
        tamanho++;
    }

    // método para pesquisar um elemento (deverá ser retornado o endereço do elemento)
    public No pesquisar(int ra) {
        No aux = inicio;
        while (aux != null) {
            if (aux.ra == ra) {
                return aux;
            }
            aux = aux.direita;
        }
        return aux;
    }

    // método para remover um elemento
    public boolean remover(int ra){
        No aux = pesquisar(ra);
        boolean status = false;

        if (aux != null) {
            // caso 1 --> lista tem apenas um elemento
            if (tamanho == 1) {
                inicio = null;
                fim = null;

            }
            else if (aux == inicio) { // caso 2 --> remover o primeiro elemento
                aux.direita.esquerda = null;
                inicio = aux.direita;
                aux.direita = null;
            }
            else if (aux == fim) { // caso 3 --> remover o último elemento
                aux.esquerda.direita = null;
                fim = aux.esquerda;
                aux.esquerda = null;
            }
            else { // caso 4 --> remover um elemento do meio
                aux.esquerda.direita = aux.direita;
                aux.direita.esquerda = aux.esquerda;
                aux.esquerda = null;
                aux.direita = null;
            }
            aux.direita = null;
            status = true;
            tamanho--;
        }
        return status;
    } 
}
