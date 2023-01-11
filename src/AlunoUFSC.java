import java.util.Scanner;

public class AlunoUFSC extends Aluno {

    // Construtor VAZIO -> Permite a criação (instaciação) de um objeto vazio
    public AlunoUFSC(){
    }

    // Construtor CHEIO -> Permite a instanciação de objetos com entrada de valores
    // ao mesmo tempo da criação
    public AlunoUFSC(String nomeAluno, String matricula, double prova1, double prova2, double prova3) {
        super.getNomeAluno();
        super.getMatricula();
        super.setProva1(prova1);
        super.setProva2(prova2);
        super.setProva3(prova3);
    }

    Scanner input = new Scanner(System.in);

    @Override
    public String toString() {
        return " AlunoUFSC { " +
                " prova1 = " + getProva1() +
                ", prova2 = " + getProva2() +
                ", prova3 = " + getProva3() + super.getNomeAluno() + super.getMatricula() +
                '}';
    }

    // SOBRESCRITA

    public double calcMedia(){
        double media = (this.getProva1()+this.getProva2())/2;
        if (media>=7){
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Informe a terceira prova: ");
            setProva3(input.nextDouble());
            calMedia(((this.getProva1()+ this.getProva2()+ this.getProva3())/3));
        }
        return 0;
    }


    public double calMedia(double notas) {
            if (notas >= 7){
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado");
        }
        return 0;
    }
}
