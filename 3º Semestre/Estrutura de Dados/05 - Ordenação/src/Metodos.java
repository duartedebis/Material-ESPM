public class Metodos {
    public static void main(String[] args) throws Exception {
       final int N = 10;
       int [] x = new int[N];
       lerDados(x);

       System.out.println("Bubble Sort = " + bolha(x));
       System.out.println("Selection Sort = " + selecao(x));
       System.out.println("Insertion Sort = " + insercao(x));
    } 

    public static void lerDados(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x.length - i;
        }
    }

    // Método Bubble Sort 
    public static int bolha(int[] v) {
        int aux;
        int total = 0;
        for(int j = 0; j < v.length; j++) {
            for(int i = 0; i < v.length - 1; i++) {
            if(v[i] > v[i + 1]) {
                aux = v[i];
                v[i] = v[i + 1];
                v[i + 1] = aux;
                total++;
                }
            }
        }
        return total;
    }
    
    // Método Selection Sort
    public static int selecao(int[] x) {
        int menor, aux;
        for(int i = 0; i < x.length - 1; i++) {
            menor = i;
            for(int j = i + 1; j < x.length; j++) {
                if(x[j] < x[menor]) {
                menor = j;
                }
            }
            aux = x[i];
            x[i] = x[menor];
            x[menor] = aux;
        }
        return 0;
    }
        
    // Método Insertion Sort
    private static int insercao(int[] x) {
        int valor, i;
        for (int j = 1; j < x.length; j++) {
            valor = x[j];
            for (i = j - 1; i >= 0 && valor < x[i]; i--) {
            x[i + 1] = x[i];
            }
            x[i + 1] = valor;
        }
        return 0;
    }
}
