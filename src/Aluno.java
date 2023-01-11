public abstract class Aluno {
    private String nomeAluno;
    private String matricula;

    private double prova1;
    private double prova2;
    private double prova3;

    // Construtores vazio e cheio..
    public Aluno(){
    }
    public Aluno(String nomeAluno, String matricula) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
    }

    public double calMedia() {
        double media = (getProva1() + (getProva2() * 2) + (getProva3() * 3)) / 6;
        if (media >= 6)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");
        return 0;
    }




    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

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

    //metodo a(){(...)}
    @Override
    public String toString() {
        return "Pessoa {" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}