public class AlunoUniville extends Pessoa {
    // Construtor VAZIO -> Permite a criação (instaciação) de um objeto vazio
    public AlunoUniville(){
    }

    // Construtor CHEIO -> Permite a instanciação de objetos com entrada de valores
    // ao mesmo tempo da criação
    public AlunoUniville(double prova1, double prova2, double prova3) {
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.prova3 = prova3;
    }

    private double prova1;
    private double prova2;
    private double prova3;

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getProva3() {
        return prova3;
    }

    public void setProva3(double prova3) {
        this.prova3 = prova3;
    }

    @Override
    public String toString() {
        return "AlunoUniville {" +
                "prova1 = " + prova1 +
                ", prova2 = " + prova2 +
                ", prova3 = " + prova3 + super.getNomeAluno() + super.getMatricula() +
                '}';
    }

    public double calMedia() {
        double media = (prova1 + (prova2 * 2) + (prova3 * 3)) / 6;
        if (media >= 6)
            System.out.println("Aprovado!");
            else
            System.out.println("Reprovado!");
            return 0;
        }
}


