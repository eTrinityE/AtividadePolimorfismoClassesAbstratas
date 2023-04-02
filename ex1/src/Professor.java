class Professor extends Pessoa {
    private String areaFormacao;

    public Professor(String nome, String areaFormacao) {
        super(nome);
        this.areaFormacao = areaFormacao;
    }

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e minha área de formação é " + areaFormacao + ".");
    }
}