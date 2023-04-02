public class Carro extends Veiculo {
    private boolean ligado;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void ligar() {
        System.out.println("Ligando o carro " + getMarca() + " " + getModelo());
        ligado = true;
    }

    public void desligar() {
        System.out.println("Desligando o carro " + getMarca() + " " + getModelo());
        ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }
}