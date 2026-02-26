public class Moto extends Veiculo{

    public Moto(String modelo, double valorCombustivel) {
        super(modelo, valorCombustivel);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        double calculo = (distancia / 30.0) * getValorCombustivel();
        return calculo;
    }
}
