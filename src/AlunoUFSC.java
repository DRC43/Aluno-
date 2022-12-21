import java.util.Scanner;

public class AlunoUFSC extends Pessoa{

    // Construtor VAZIO -> Permite a criação (instaciação) de um objeto vazio
    public AlunoUFSC(){
    }

    // Construtor CHEIO -> Permite a instanciação de objetos com entrada de valores
    // ao mesmo tempo da criação
    public AlunoUFSC(String nomeAluno, String matricula, double prova1, double prova2, double prova3) {
        super.getNomeAluno();
        super.getMatricula();
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.prova3 = prova3;
    }

    Scanner input = new Scanner(System.in);
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
        return "AlunoUFSC {" +
                "prova1 = " + prova1 +
                ", prova2 = " + prova2 +
                ", prova3 = " + prova3 + super.getNomeAluno() + super.getMatricula() +
                '}';
    }
    public double calcMedia(){
        double media = (this.prova1+this.prova2)/2;
        if (media>=7){
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Informe a terceira prova: ");
            this.prova3 = input.nextDouble();
            if(prova3>=7){
                System.out.println("Aprovado!");
        }
        else
        System.out.println("Reprovado");
        }
        return 0;
    }
}
