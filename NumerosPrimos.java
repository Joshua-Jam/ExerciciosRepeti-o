import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para encontrar todos os primos até este número: ");
        int n = scanner.nextInt();

        int divisoes = 0;
        System.out.println("Números primos entre 1 e " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
            divisoes++;
        }
        System.out.println("Número total de divisões: " + divisoes);
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}