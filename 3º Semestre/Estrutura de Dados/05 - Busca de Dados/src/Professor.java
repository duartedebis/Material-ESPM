public class Professor implements Comparable<Professor> {
    private String nome;
    private int totaldeAulas;
    private double valorAula;
    private String titulacao;

    // Método Construtor → Inicializar o os atributos do objeto
    public Professor(String nome, int totaldeAulas, double valorAula, String titulacao) {
        this.nome = nome;
        this.totaldeAulas = totaldeAulas;
        this.valorAula = valorAula;
        this.titulacao = titulacao;
    } 

    // Método para calcular e retomar o valor do salário

    public double calcularSalario() {
        double salarioBase = calcularSalarioBase();
        double horaAtividade = calcularHoraAtividade(salarioBase);
        double descansoSemanal = calcularDescansoSemanal(salarioBase, horaAtividade);
        return (salarioBase + horaAtividade + descansoSemanal);
    }
    private double calcularSalarioBase() {
        double salarioBase = totaldeAulas * valorAula * 4.5;
        if (titulacao.equalsIgnoreCase("Mestre")) {
            salarioBase *= 1.085;
        } else {
            salarioBase *= 1.12;
        }
        return salarioBase;
    }

    private double calcularHoraAtividade(double salarioBase) {
        return salarioBase * 0.05;
    }
    
    private double calcularDescansoSemanal(double salarioBase, double horaAtividade) {
        return (salarioBase + horaAtividade) / 6;
    }

    // Sets & Gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotaldeAulas() {
        return totaldeAulas;
    }

    public void setTotaldeAulas(int totaldeAulas) {
        this.totaldeAulas = totaldeAulas;
    }

    public double getValorAula() {
        return valorAula;
    }

    public void setValorAula(double valorAula) {
        this.valorAula = valorAula;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
   
    
    

    @Override //sobrescrevendo um método e não criando um novo.
    public int compareTo(Professor p){
       return (int)(calcularSalario() - p.calcularSalario()); //forma elegante
    }
    // public int compareTo(Professor p){
    //     if (calcularSalario() == p.calcularSalario()){
    //         return 0;
    //     }
    //     else if(calcularSalario() > p.calcularSalario()){
    //         return 1;
    //     }
    //     return -1;
    // }
} 

