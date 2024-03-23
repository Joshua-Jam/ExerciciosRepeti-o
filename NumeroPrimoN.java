import java.util.Scanner;

public class NumeroPrimoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limiteSuperior = scanner.nextInt();

        System.out.println("Números primos entre 1 e " + limiteSuperior + ":");

        for (int i = 2; i <= limiteSuperior; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
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