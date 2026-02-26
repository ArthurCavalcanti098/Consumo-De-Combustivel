import java.util.ArrayList;

public class Main{
    static void main() {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Carro carro = new Carro("Sedan", 5.80);
        Caminhao caminhao = new Caminhao("Sacania", 6.20, 10);
        Moto moto = new Moto("Honda Biz", 5.80);

        veiculos.add(carro);
        veiculos.add(caminhao);
        veiculos.add(moto);

        double custoTotalFrota = 0;

        while (true) {
            for (Veiculo p : veiculos) {
                System.out.printf("Modelo: " + p.getModelo() + " | Custo: %.2f%n", p.calcularCustoViagem(500));
                custoTotalFrota += p.calcularCustoViagem(500);
            }
            break;
        }

        System.out.println("\n\n O custo total da frotá será: " + custoTotalFrota);


    }
}