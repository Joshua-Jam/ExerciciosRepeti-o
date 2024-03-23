import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = calcularFatorial(numero);

        System.out.println("Fatorial de: " + numero);
        System.out.print(numero + "! = ");
        for (int i = numero; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" . ");
            }
        }
        System.out.println(" = " + fatorial);
    }

    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}