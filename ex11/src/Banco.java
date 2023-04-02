class Banco {
    public void pagaJuros(Conta[] contas, double taxaJuros) {
        for (Conta conta : contas) {
            if (conta instanceof ContaPoupanca) {
                double juros = conta.getSaldo() * taxaJuros;
                conta.sacar(juros);
            }
        }
    }
}