public abstract class Pessoa {
    private String nome;
    private String data;
    private String endereco;

    public Pessoa(String nome, String data, String endereco) {
        this.nome = nome;
        this.data = data;
        this.endereco = endereco;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
