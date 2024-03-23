import java.util.Scanner;

public class EstatisticasNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem inseridos: ");
        int quantidadeNumeros = scanner.nextInt();

        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // Atualiza o menor valor
            if (numero < menorValor) {
                menorValor = numero;
            }

            // Atualiza o maior valor
            if (numero > maiorValor) {
                maiorValor = numero;
            }

            // Soma os valores
            soma += numero;
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + soma);
    }
}