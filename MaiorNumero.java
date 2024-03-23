import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = 5;
        int maiorNumero = Integer.MIN_VALUE;

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número digitado é: " + maiorNumero);
    }
}