import java.util.Scanner;

public class CalculhoH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N (quantidade de termos): ");
        int N = scanner.nextInt();

        double H = calcularH(N);

        System.out.println("O valor de H com " + N + " termos é: " + H);

        scanner.close();
    }

    public static double calcularH(int N) {
        double soma = 0;

        for (int i = 1; i <= N; i++) {
            soma += 1.0 / i; // Convertendo para double para garantir a precisão da divisão
        }

        return soma;
    }
}