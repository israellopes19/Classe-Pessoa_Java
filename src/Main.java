public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Tesla","Tesla x", 100000 );
        Moto moto = new Moto("Honda", "CG 160", 14000);
        Caminhao caminhao = new Caminhao("Volvo", "FH 560",1000000);

                System.out.println("Meu carro: " + carro.getMarca());
                System.out.println("Meu Moto: " + moto.getModelo());
                System.out.println("Meu Caminhão: " + caminhao.getMarca());

        }
    }
