import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para gerar a tabuada (entre 1 e 10): ");
        int numero = scanner.nextInt();

        // Verifica se o número está dentro do intervalo permitido (entre 1 e 10)
        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido! Por favor, digite um número entre 1 e 10.");
            return;
        }

        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}