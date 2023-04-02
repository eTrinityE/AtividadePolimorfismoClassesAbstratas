class Eletronico extends Produto {
    Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    double calcularDesconto() {
        return getPreco() * 0.1;
    }
}