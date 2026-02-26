public class Carro extends Veiculo{
     public Carro(String modelo, double valorCombustivel) {
         super(modelo, valorCombustivel);
     }

     @Override
    public double calcularCustoViagem(int distancia) {
         double custo = (distancia / 12) * getValorCombustivel();
         return custo;
     }
}
