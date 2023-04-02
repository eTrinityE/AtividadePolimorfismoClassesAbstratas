public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Onix RS", 2022);
        Moto moto = new Moto("BMW", "G310 GS", 2021);

        Garagem garagem = new Garagem();

        garagem.estacionar(carro);
        garagem.estacionar(moto);
    }
}
