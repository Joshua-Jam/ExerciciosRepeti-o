import java.util.Scanner;

public class IntervaloESoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Verifica qual número é o menor e qual é o maior
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        System.out.println("Números inteiros no intervalo entre " + menor + " e " + maior + ":");
        int soma = 0;
        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
            soma += i;
        }

        System.out.println("A soma dos números no intervalo é: " + soma);
    }
}