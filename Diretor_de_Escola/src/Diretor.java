public class Diretor extends Pessoa{
    private String instituicao;

    public Diretor(String instituicao){
        this.instituicao = instituicao;
    }
    public String getinstituicao(){
        return instituicao;
    }
    public void setInstituicao(String instituicao){
        this.instituicao = instituicao;
    }
}
