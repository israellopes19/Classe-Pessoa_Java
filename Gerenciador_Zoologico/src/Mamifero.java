public class Mamifero extends Animal{
    private String alimentacao;

    public Mamifero(String nome, String idade, String especie, String alimentacao) {
        super(nome, idade, especie);
        this.alimentacao = alimentacao;
    }

    public String getalimentacao(){
      return alimentacao;
    }
    public void setAlimentacao(String alimentacao){
     this.alimentacao = alimentacao;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "alimentacao='" + alimentacao + '\'' +
                super.toString()+
                '}';
    }
}

