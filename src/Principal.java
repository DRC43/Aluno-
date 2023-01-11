/* Construir uma aplicação de cálculo de notas de um aluno, sabendo que ele pode ser aluno
da UNIVILLE ou aluno da UFSC, que possuem formas de avaliação diferente. Mostrar os dados
e a média do aluno.

HERANÇA = possibilidade de se reutilizar os atributos e os métodos em outra classe.
É possível fazer herança única, não existe herança múltipla no Java, mas uma classe
pode gerar várias outras classes-filhas.

SUPERCLASSE: PESSOA -> aluno         -> estagiario
                    -> funcionario
*/

public class Principal {
    public static void main(String[] args) {

        AlunoUFSC aluno1 = new AlunoUFSC();
        AlunoUFSC aluno2 = new AlunoUFSC("Dener Corrêa", "2022-010203",
                9.5, 1.5, 6.4);

        aluno1.setNomeAluno(" Dener Corrêa");
        aluno1.setMatricula(" 2022-010203");
        aluno1.setProva1(5.5);
        aluno1.setProva2(8.5);

        System.out.println(aluno1.getNomeAluno());
        System.out.println(aluno1.getMatricula());
        System.out.println(aluno1.toString());
        aluno1.calcMedia();

        AlunoUniville aluno3 = new AlunoUniville();
        AlunoUniville aluno4 = new AlunoUniville(6.5, 5.5, 9.5);
        aluno3.setNomeAluno(" Deivid Corrêa");
        aluno3.setMatricula(" 2022-030201");
        aluno3.setProva1(6.5);
        aluno3.setProva2(5.5);
        aluno3.setProva3(9.5);

        System.out.println(aluno3.getNomeAluno());
        System.out.println(aluno3.getMatricula());
        System.out.println(aluno3.toString());
        aluno3.calMedia();
    }
}
