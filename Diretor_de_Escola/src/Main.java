public class Main {
    public static void main(String[] args) {


        Aluno alun = new Aluno("1234567","Israel", "15105520032" ,"Rua Coronel benendito");
        Professor salar = new Professor("2.000");
        Diretor instit = new Diretor("Ete Cícero Dias ");

        System.out.println("Nome:" + alun.getNome());
        System.out.println("Salario:" + salar.getSalario());
        System.out.println("Instiucao:" +instit.getinstituicao());
    }
}