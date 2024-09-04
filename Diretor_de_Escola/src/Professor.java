public class Professor extends Pessoa{
    private String salario;

    public Professor(String salario){
        this.salario = salario;
    }
    public String getSalario(){
        return salario;
    }
    public void setSalario(String salario){
        this.salario = salario;
    }
}


