class ContaEspecial extends Conta {
    private double limiteCredito;

    public ContaEspecial(double saldoInicial, double limiteCredito) {
        super(saldoInicial);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limiteCredito) {
            saldo -= valor;
        }
    }
}