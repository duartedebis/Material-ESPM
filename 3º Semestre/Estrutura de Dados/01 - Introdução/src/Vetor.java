public class Vetor {
    public static void main(String[] args) {
        int[] tabuada = new int[10];
        
        for (int i = 0; i < tabuada.length; i++) {
            tabuada[i] = (int) (Math.random() * 150); //casting > conversão de tipos
        }
    }
}
