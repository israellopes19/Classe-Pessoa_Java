public class Main {
    public static void main(String[] args) {

        Circulo c = new Circulo(5);
        System.out.printf("A área é %.2f\n", c.calcArea());
        System.out.println(c.calPerimetro());

        Retangulo r = new Retangulo(4,5);
        System.out.printf("A área do Retangulo %.2f\n", r.calcArea());
        System.out.println(r.calPerimetro());

        Triangulo t = new Triangulo(2,3);
        System.out.printf("A área do Triangulo %.2f\n", t.calcArea());
        System.out.println(t.calPerimetro());
    }
}
