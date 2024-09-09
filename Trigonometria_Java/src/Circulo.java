public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;

    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double calPerimetro() {
        return 2 * this.raio * Math.PI;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
}

    }

