package SistemaVeiculo;

public class Caminhao extends SistemaVeiculo {

    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " " + marca + " está engrenando a próxima marcha e acelerando lentamente.");
    }
}
