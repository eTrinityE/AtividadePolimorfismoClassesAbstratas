public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(3.0, 4.0);
        Triangulo triangulo = new Triangulo(2.0, 5.0);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
    }

}