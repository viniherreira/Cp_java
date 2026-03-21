public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "vinicius";
        aluno1.idade = 18;
        aluno1.tipoVeiculo = "carro";
        aluno1.aulasPraticas = 10;
        aluno1.aulasTeoricas = 10;

        aluno1.agendarAulaPratica();
        aluno1.agendarAulaTeorica();

        aluno1.realizarExame();


        Aluno aluno2 = new Aluno();
        aluno2.nome = "Enzo";
        aluno2.idade = 18;
        aluno2.tipoVeiculo = "carro";
        aluno2.aulasPraticas = 33;
        aluno2.aulasTeoricas = 17;


        aluno2.cancelarAulaPratica();
        aluno2.cancelarAulaTeorica();
        aluno2.realizarExame();


        Aluno aluno3 = new Aluno();
        aluno3.nome = "Pedro";
        aluno3.idade = 18;
        aluno3.tipoVeiculo = "carro";
        aluno3.aulasPraticas = 6;
        aluno3.aulasTeoricas = 6;

        aluno3.agendarAulaPratica();
        aluno3.agendarAulaTeorica();
        aluno3.realizarExame();


        Aluno aluno4 = new Aluno();
        aluno4.nome = "Lucas";
        aluno4.idade = 18;
        aluno4.tipoVeiculo = "carro";
        aluno4.aulasPraticas = 6;
        aluno4.aulasTeoricas = 0;

        aluno4.agendarAulaPratica();
        aluno4.cancelarAulaTeorica();
        aluno4.realizarExame();


        AutoEscola escola = new AutoEscola();
        escola.aluno1 = aluno1;
        escola.aluno2 = aluno2;
        escola.aluno3 = aluno3;
        escola.aluno4 = aluno4;

        Instrutor instrutor1 = new Instrutor();
        instrutor1.nome = "carlos manoel";
        instrutor1.experiencia = 15;
        instrutor1.categoria = "carro";

        Veiculo veiculo1 = new Veiculo();
        veiculo1.tipo = "carro";
        veiculo1.modelo = "sedan";
        veiculo1.placa = "abiu230";


        escola.exibirResumo();
    }
}