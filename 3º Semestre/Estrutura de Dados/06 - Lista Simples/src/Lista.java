public class Lista {

    No inicio, fim;

    // classe No que representa os elementos individuais da lista
    public class No {
        int dado;
        No proximo;
    }

    // método para inserir um elemento no final da lista
    public void inserirFim(int valor) {
        No aux = new No();
        aux.dado = valor;

        if (inicio == null) {
            inicio = aux;
            fim = aux;
        } 
        else {
            fim.proximo = aux;
            fim = aux;
        }
    }

    // método para inserir um elemento no início da lista
    public void inserirInicio(int valor) {
        No aux = new No();
        aux.dado = valor;

        if (inicio == null) {
            inicio = aux;
            fim = aux;
        } 
        else {
            aux.proximo = inicio;
            inicio = aux;
        }
    }

    // método para retornar o tamanho da lista (quantidade de nós)
    public int tamanho() {
        int total = 0;
        No aux = inicio;
        while (aux != null) {
            total++;
            aux = aux.proximo;
        }
        return total;
    }

    // método para pesquisar um elemento da lista
    public boolean pesquisar(int valor) {
        No aux = inicio;
        while (aux != null) {
            if (aux.dado == valor) {
                return true;
            }
            aux = aux.proximo;
        }
        return false;
    }

    // método para imprimir os elementos da lista
    public void imprimir() {
        No aux = inicio;
        while (aux != null) {
            System.out.println(aux.dado);
            aux = aux.proximo;
        }
    }
}
