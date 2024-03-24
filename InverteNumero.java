import java.util.Scanner;

public class InverteNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            int numeroInvertido = inverterNumero(numero);
            System.out.println("Número invertido: " + numeroInvertido);
        }

        scanner.close();
    }

    public static int inverterNumero(int numero) {
        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        return numeroInvertido;
    }
}