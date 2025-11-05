package SistemaVeiculo;

public abstract class SistemaVeiculo {
    private String marca;
    private String modelo;
    private int ano;

    public SistemaVeiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public abstract void acelerar();

    public static void main(String[] args) {
        SistemaVeiculo carro = new Carro("Toyota", "Corolla", 2022);
        SistemaVeiculo moto = new Moto("Honda", "CB 500", 2023);
        SistemaVeiculo caminhao = new Caminhao("Volvo", "FH16", 2020);

        carro.exibirDetalhes();
        carro.acelerar();

        System.out.println();

        moto.exibirDetalhes();
        moto.acelerar();

        System.out.println();

        caminhao.exibirDetalhes();
        caminhao.acelerar();
    }
}
