package SistemaVeiculo;

public class Carro extends SistemaVeiculo {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " " + marca + " está acelerando de 0 a 100 km/h em 8 segundos.");
    }
}
