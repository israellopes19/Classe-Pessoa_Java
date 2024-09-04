public class Aluno extends Pessoa{
    private String matricula;


    public Aluno(String matricula,String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }

    public Aluno() {
    }
    public String getMatricula(){
      return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}

