import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        long resultado = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
    }

    public static long calcularPotencia(int base, int expoente) {
        long resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}