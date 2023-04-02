class Aluno extends Pessoa {
    private String curso;
    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }
    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e estou matriculado no curso de " + curso + ".");
    }
}