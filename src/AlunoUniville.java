public class AlunoUniville extends Aluno {
    // Construtor VAZIO -> Permite a criação (instaciação) de um objeto vazio
    public AlunoUniville(){
    }

    // Construtor CHEIO -> Permite a instanciação de objetos com entrada de valores
    // ao mesmo tempo da criação
    public AlunoUniville(double prova1, double prova2, double prova3) {
        super.setProva1(prova1);
        super.setProva2(prova2);
        super.setProva3(prova3);
    }

    @Override
    public String toString() {
        return "AlunoUniville {" +
                "prova1 = " + getProva1() +
                ", prova2 = " + getProva2() +
                ", prova3 = " + getProva3() + super.getNomeAluno() + super.getMatricula() +
                '}';
    }


}


