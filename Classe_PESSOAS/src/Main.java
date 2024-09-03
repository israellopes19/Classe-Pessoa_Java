//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//4º começa aqui.
public class Main {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("12345678910","Alan Michel","30/09/1924", "Rua Linha do Tiro");
        PessoaJuridica cj = new PessoaJuridica("21258264000141");

        System.out.println("Nome: " + pf.getNome());
        System.out.println("CNPJ: " + cj.getCnpj());
    }

}