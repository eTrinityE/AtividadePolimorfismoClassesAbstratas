class Gerente extends Funcionario {
    Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    double calcularSalario() {
        return getSalarioBase() * 2;
    }
}