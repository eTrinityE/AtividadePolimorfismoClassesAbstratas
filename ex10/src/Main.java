import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();
        Galinha galinha = new Galinha();

        ArrayList<Animal> animais = new ArrayList<Animal>();
        animais.add(cachorro);
        animais.add(gato);
        animais.add(vaca);
        animais.add(galinha);

        Fazenda fazenda = new Fazenda();
        fazenda.alimentarAnimais(animais);
    }
}