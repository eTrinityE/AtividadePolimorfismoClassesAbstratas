public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000);
        cc.sacar(500);
        System.out.println("Saldo conta corrente: " + cc.getSaldo());

        ContaEspecial ce = new ContaEspecial(1000, 500);
        ce.sacar(1500);
        System.out.println("Saldo conta especial: " + ce.getSaldo());

        ContaPoupanca cp = new ContaPoupanca(1000);
        cp.sacar(800);
        System.out.println("Saldo conta poupança: " + cp.getSaldo());

        Conta[] contas = {cc, ce, cp};
        Banco banco = new Banco();
        banco.pagaJuros(contas, 0.05);
        System.out.println("Novo saldo conta poupança: " + cp.getSaldo());
    }
}