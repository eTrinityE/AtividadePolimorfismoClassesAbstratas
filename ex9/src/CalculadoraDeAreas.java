class CalculadoraDeAreas {
    static double somarAreas(Forma[] formas) {
        double total = 0;
        for (Forma forma : formas) {
            total += forma.calcularArea();
        }
        return total;
    }
}