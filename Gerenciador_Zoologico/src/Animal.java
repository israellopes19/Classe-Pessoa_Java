public  abstract class Animal {

    private String nome;
    private String idade;
    private String especie;

    public Animal(String nome, String idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }
    public Animal(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }
}
