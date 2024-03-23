import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas você deseja calcular a média? ");
        int quantidadeNotas = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / quantidadeNotas;

        System.out.println("A média das " + quantidadeNotas + " notas é: " + media);
    }
}