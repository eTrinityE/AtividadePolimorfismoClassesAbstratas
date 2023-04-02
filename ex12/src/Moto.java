public class Moto extends Veiculo {
    private boolean ligada;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void ligar() {
        System.out.println("Ligando a moto " + getMarca() + " " + getModelo());
        ligada = true;
    }

    public void desligar() {
        System.out.println("Desligando a moto " + getMarca() + " " + getModelo());
        ligada = false;
    }

    public boolean isLigada() {
        return ligada;
    }
}