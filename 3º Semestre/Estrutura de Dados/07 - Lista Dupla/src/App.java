public class App {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.inserirFinal("Selmini", 1);
        lista.inserirFinal("Sandra", 2);
        lista.inserirFinal("Surian", 3);
        lista.inserirFinal("Flávio", 4);
        // a ordem de ra será: 4,3,1,2

        //System.out.println(lista.pesquisar(15));
        System.out.println(lista.remover(1));
        System.out.println(lista.remover(4));
        System.out.println(lista.remover(3));
    }
}
