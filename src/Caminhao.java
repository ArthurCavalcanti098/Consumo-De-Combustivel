public class Caminhao extends Veiculo{
    private int cargaTonelada;

    public Caminhao(String modelo, double valorCombustivel, int cargaTonelada) {
        super(modelo, valorCombustivel);
        this.cargaTonelada = cargaTonelada;
    }

    //Um caminhão faz 5 km por litro, mas para cada tonelada de carga, a eficiência cai em 0.1
    @Override
    public double calcularCustoViagem(int distancia) {
        double calculo = (distancia / (5 - (cargaTonelada * 0.1))) * getValorCombustivel();
        return calculo;
    }
}
