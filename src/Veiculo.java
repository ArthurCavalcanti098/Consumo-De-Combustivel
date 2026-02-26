public abstract class Veiculo {
    private String modelo;
    private double valorCombustivel;

    public Veiculo(String modelo, double valorCombustivel) {
        this.modelo = modelo;
        this.valorCombustivel = valorCombustivel;
    }

    public void setValorCombustivel() {
        this.valorCombustivel = valorCombustivel;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    abstract double calcularCustoViagem(int distancia) ;

}
