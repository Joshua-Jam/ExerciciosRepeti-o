import java.util.Scanner;

public class SerieS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n (quantidade de termos da série): ");
        int n = scanner.nextInt();

        double soma = calcularSerie(n);

        System.out.println("Soma da série: " + soma);

        scanner.close();
    }

    public static double calcularSerie(int n) {
        double soma = 0;
        int denominador = 1;

        for (int i = 1; i <= n; i++) {
            soma += (double) i / denominador;
            denominador += 2;
        }

        return soma;
    }
}