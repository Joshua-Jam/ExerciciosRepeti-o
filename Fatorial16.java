import java.util.Scanner;

public class Fatorial16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar;

        do {
            int numero;

            do {
                System.out.print("Digite um número inteiro positivo menor que 16 para calcular o fatorial: ");
                numero = scanner.nextInt();
            } while (numero < 0 || numero >= 16);

            long fatorial = calcularFatorial(numero);

            System.out.println(numero + "! = " + fatorial);

            System.out.print("Deseja calcular outro fatorial? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
    }

    public static long calcularFatorial(int numero) {
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}