abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    abstract void apresentar();
}