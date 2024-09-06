public class Main{
    public static void main(String[] args){

        Mamifero M = new Mamifero("Herbívoro","Macaco","19 anos","Primatas");
        Ave A = new Ave("Ratitas","Galinha","3 anos","Gallus gallus domesticus");
        Reptil R = new Reptil ("Squata","Serpentes","5 anos","Viperidae");

        System.out.println(M);
        System.out.println(A);
        System.out.println(R);
    }
}