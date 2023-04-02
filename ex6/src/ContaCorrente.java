class ContaCorrente extends Conta {
    ContaCorrente(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    void verificarConta() {
        System.out.println("Conta corrente verificada - Número: " + getNumeroConta() + ", Saldo: " + getSaldo());
    }
}
