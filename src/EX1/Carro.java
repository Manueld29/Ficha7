package EX1;

public class Carro {
    private double velocidade=0;
    private String marca;
    private Condutor motorista;

    public Carro(String marca, String motorista) {
        this.marca = marca;
        this.motorista = new Condutor(motorista);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void acelerar() {
        setVelocidade(getVelocidade()+15);
    }

    public void travar(){
        setVelocidade(getVelocidade()-15);
    }
    public void mostrarVelocidade(){
        System.out.println("A velocide atual é :"+getVelocidade());
    }

    @Override
    public String toString() {
        return getMarca() + motorista.getNome() +getVelocidade();
    }
}
