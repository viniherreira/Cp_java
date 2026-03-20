public class Aluno {

    String nome;
    int idade;
    String tipoVeiculo;
    int aulasTeoricas;
    int aulasPraticas;
    boolean aprovado;

    public void agendarAulaPratica() {
        aulasPraticas +=   1;
    }

    public void cancelarAulaPratica() {
        aulasPraticas -=   1;
    }

    public void agendarAulaTeorica() {
        aulasTeoricas +=   1;
    }

    public void cancelarAulaTeorica() {
        aulasTeoricas -=   1;
    }

    public void realizarExame() {
        if (aulasTeoricas >= 5 && aulasPraticas >= 5) {
            aprovado = true ;
        } else  {
            aprovado = false;
        }

    }
}