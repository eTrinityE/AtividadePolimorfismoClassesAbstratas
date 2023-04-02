public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo caminhao = new Caminhao();

        int velocidadeAtual = 50;

        carro.acelerar(velocidadeAtual);
        moto.acelerar(velocidadeAtual);
        caminhao.acelerar(velocidadeAtual);
    }
}