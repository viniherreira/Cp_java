public class Aluno {

    String nome;
    int idade;
    String tipoVeiculo;
    int aulasTeoricas;
    int aulasPraticas;
    boolean aprovado;

    public void agendarAulaPratica() {
        aulasPraticas += 1;
    }

    public void cancelarAulaPratica() {
        if (aulasPraticas > 0 )
            aulasPraticas --;
    }

    public void agendarAulaTeorica() {
       aulasTeoricas += 1;
    }

    public void cancelarAulaTeorica() {
        if (aulasTeoricas > 0 )
            aulasTeoricas --;
    }

    public void realizarExame() {
        if (aulasTeoricas >= 5 && aulasPraticas >= 5) {
            aprovado = Math.random() > 0.5;
        } else {
            System.out.println(nome + " não pode fazer o exame");
            aprovado = false;
        }
    }
}