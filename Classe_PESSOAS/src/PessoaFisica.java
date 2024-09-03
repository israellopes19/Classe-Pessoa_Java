// 2º começa aqui
public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String cpf, String nome, String data, String endereco) {
        super(nome, data, endereco);
        this.cpf = cpf;
    }

    public PessoaFisica() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
