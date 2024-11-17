import builders.VeiculoBuilder;
import entidades.Veiculo;

public class TesteVeiculo {
    public static void main(String[] args) {
        buildVeiculo();
    }

    public static void buildVeiculo() {
        Veiculo carro = new VeiculoBuilder()
                .setTipo("Carro")
                .setCor("Preto")
                .setRodas("4")
                .build();

        Veiculo moto = new VeiculoBuilder()
                .setTipo("Moto")
                .setCor("Vermelho")
                .setRodas("2")
                .build();

        System.out.println(carro.toString());
        System.out.println(moto.toString());
    }
}