public class Main {
    public static void main(String[] args) {
        Produto eletronico = new Eletronico("Smartphone", 2000.0);
        Produto vestuario = new Vestuario("Camiseta", 50.0);
        Produto alimento = new Alimento("Arroz", 10.0);

        System.out.println("Desconto do eletrônico: " + eletronico.calcularDesconto());
        System.out.println("Desconto do vestuário: " + vestuario.calcularDesconto());
        System.out.println("Desconto do alimento: " + alimento.calcularDesconto());
    }
}