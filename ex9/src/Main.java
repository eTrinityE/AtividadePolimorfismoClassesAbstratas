public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[] {
                new Triangulo(3, 5),
                new Triangulo(4, 6),
                new Circulo(2),
                new Circulo(3),
                new Quadrado(4)
        };

        double total = CalculadoraDeAreas.somarAreas(formas);
        System.out.println("A soma das áreas é: " + total);
    }
}