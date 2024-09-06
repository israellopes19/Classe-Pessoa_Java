public class  Ave extends Animal {
    private String Aerodinamica;

    public Ave(String nome, String idade, String especie, String aerodinamica) {
        super(nome, idade, especie);
        Aerodinamica = aerodinamica;
    }


    public String getAerodinamica(){
        return Aerodinamica;
    }
    public void setAerodinamica(String Aerodinamica){
        this.Aerodinamica = Aerodinamica;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "Aerodinamica='" + Aerodinamica + '\'' +
                super.toString()+
                '}';
    }
}