abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
}