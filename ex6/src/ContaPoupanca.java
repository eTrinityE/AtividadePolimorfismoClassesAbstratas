class ContaPoupanca extends Conta {
    ContaPoupanca(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    void verificarConta() {
        System.out.println("Conta poupança verificada - Número: " + getNumeroConta() + ", Saldo: " + getSaldo());
    }
}