public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double preco;



public Veiculo(String marca, String modelo, double preco){
    this.marca = marca;
    this.modelo = modelo;
    this.preco = preco;
}

public Veiculo(){

}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

