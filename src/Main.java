import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");

        int escolha = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = Matematica.soma(num1, num2);
                break;
            case 2:
                resultado = Matematica.subtracao(num1, num2);
                break;
            case 3:
                resultado = Matematica.divisao(num1, num2);
                break;
            case 4:
                resultado = Matematica.multiplicacao(num1, num2);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}

