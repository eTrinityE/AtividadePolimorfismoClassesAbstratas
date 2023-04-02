public class Main {
    public static void main(String[] args) {
        Funcionario assistente = new Assistente("José", 2000.0);
        Funcionario gerente = new Gerente("Maria", 5000.0);
        Funcionario diretor = new Diretor("Antônio", 10000.0);

        System.out.println("Salário do assistente: " + assistente.calcularSalario());
        System.out.println("Salário do gerente: " + gerente.calcularSalario());
        System.out.println("Salário do diretor: " + diretor.calcularSalario());
    }
}