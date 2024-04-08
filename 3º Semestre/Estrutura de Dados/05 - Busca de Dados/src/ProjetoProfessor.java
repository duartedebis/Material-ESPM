
import java.util.Arrays;

public class ProjetoProfessor {
    public static void main(String[] args) throws Exception{
        Professor[] professor = new Professor[3];

        // Nome, totaldeAulas, valorAula, titulacao
        professor[0] = new Professor("Selmini", 20, 50, "Doutor");
        professor[1] = new Professor("Rafa", 20, 50, "Mestre");
        professor[2] = new Professor("Humberto", 20, 50, "Doutor");
        
        Arrays.sort(professor);

        for (Professor p : professor){
            System.out.println(p.getNome());
            System.out.println(p.calcularSalario());
            System.out.println();
        }
    }
}