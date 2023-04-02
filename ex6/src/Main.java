public class Main {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente("1234", 1000.0);
        Conta conta2 = new ContaPoupanca("5678", 5000.0);
        Conta conta3 = new ContaCorrente("9012", 200.0);

        conta1.verificarConta();
        conta2.verificarConta();
        conta3.verificarConta();
    }
}