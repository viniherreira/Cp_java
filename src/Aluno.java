public class Aluno {

    String nome;
    int idade;
    String tipoVeiculo;
    int aulasTeoricas;
    int aulasPraticas;
    boolean aprovado;

    public void agendarAulaPratica() {
        aulasPraticas = aulasPraticas + 1;
    }

    public void cancelarAulaPratica() {
        aulasPraticas = aulasPraticas - 1;
    }

    public void agendarAulaTeorica() {
        aulasPraticas = aulasTeoricas + 1;
    }

    public void cancelarAulaTeorica() {
        aulasPraticas = aulasTeoricas - 1;
    }

    public void realizarExame() {
        if (aulasTeoricas >= 5 && aulasPraticas >= 5) {
            aprovado = true; // sempre passa (bem simples)
        } else {
            aprovado = false;
        }
    }
}