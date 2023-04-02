class Funcionario extends Pessoa {
    private String funcao;
    public Funcionario(String nome, String funcao) {
        super(nome);
        this.funcao = funcao;
    }

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e minha função é " + funcao + ".");
    }
}