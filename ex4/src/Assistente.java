class Assistente extends Funcionario {
    Assistente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    double calcularSalario() {
        return getSalarioBase();
    }
}