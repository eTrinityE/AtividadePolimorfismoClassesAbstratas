class Diretor extends Funcionario {
    Diretor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    double calcularSalario() {
        return getSalarioBase() * 3;
    }
}