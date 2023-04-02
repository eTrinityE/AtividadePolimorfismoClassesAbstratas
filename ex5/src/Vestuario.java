class Vestuario extends Produto {
    Vestuario(String nome, double preco) {
        super(nome, preco);
    }

    double calcularDesconto() {
        return getPreco() * 0.2;
    }
}