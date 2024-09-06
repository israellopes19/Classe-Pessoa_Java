public class Reptil extends Animal{
    private String ordem;

    public Reptil(String nome, String idade, String especie, String ordem) {
        super(nome, idade, especie);
        this.ordem = ordem;
    }



    public String getordem(){
      return ordem;
    }
    public void setordem(String ordem){
        this.ordem = ordem;
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "ordem='" + ordem + '\'' +
                super.toString()+
                '}';
    }
}

