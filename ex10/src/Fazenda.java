import java.util.ArrayList;

class Fazenda {
    public void alimentarAnimais(ArrayList<Animal> animais) {
        for (Animal animal : animais) {
            animal.comer();
        }
    }
}