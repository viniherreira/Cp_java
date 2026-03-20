public class AutoEscola {
    Aluno aluno1;
    Aluno aluno2;
    Aluno aluno3;
    Aluno aluno4;

    public void exibirResumo(){
        System.out.println("### RESUMO DOS ALUNOS ###");

        System.out.println("Aluno 1: " + aluno1.nome);
        System.out.println("Aulas Teóricas: " + aluno1.aulasTeoricas);
        System.out.println("Aulas Práticas: " + aluno1.aulasPraticas);
        System.out.println("Aprovado: " + aluno1.aprovado);

        System.out.println("----------------------");

        System.out.println("Aluno 2: " + aluno2.nome);
        System.out.println("Aulas Teóricas: " + aluno2.aulasTeoricas);
        System.out.println("Aulas Práticas: " + aluno2.aulasPraticas);
        System.out.println("Aprovado: " + aluno2.aprovado);

        System.out.println("----------------------");

        System.out.println("Aluno 3: " + aluno3.nome);
        System.out.println("Aulas Teóricas: " + aluno3.aulasTeoricas);
        System.out.println("Aulas Práticas: " + aluno3.aulasPraticas);
        System.out.println("Aprovado: " + aluno3.aprovado);

        System.out.println("----------------------");

        System.out.println("Aluno 4: " + aluno4.nome);
        System.out.println("Aulas Teóricas: " + aluno4.aulasTeoricas);
        System.out.println("Aulas Práticas: " + aluno4.aulasPraticas);
        System.out.println("A " + aluno4.aprovado);
    }
}
