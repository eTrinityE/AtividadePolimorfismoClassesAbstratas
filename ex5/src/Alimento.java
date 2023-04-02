class Alimento extends Produto {
    Alimento(String nome, double preco) {
        super(nome, preco);
    }

    double calcularDesconto() {
        return getPreco() * 0.05;
    }
}