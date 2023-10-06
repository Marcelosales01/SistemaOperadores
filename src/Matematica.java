public class Matematica {
    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double divisao(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN; // Retorna um valor especial para indicar erro.
        }
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }
}

