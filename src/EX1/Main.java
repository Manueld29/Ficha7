package EX1;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Bmw", "Rui");
        carro1.acelerar();
        carro1.acelerar();
        carro1.mostrarVelocidade();
        carro1.travar();
        System.out.println(carro1.toString());
    }
}

