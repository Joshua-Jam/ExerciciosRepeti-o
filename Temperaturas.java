import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        int quantidade = 0;

        System.out.println("Digite as temperaturas (digite 0 para finalizar):");

        while (true) {
            double temperatura = scanner.nextDouble();

            if (temperatura == 0) {
                break;
            }

            soma += temperatura;
            quantidade++;

            if (temperatura < menor) {
                menor = temperatura;
            }

            if (temperatura > maior) {
                maior = temperatura;
            }
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("Menor temperatura: " + menor);
            System.out.println("Maior temperatura: " + maior);
            System.out.println("Média das temperaturas: " + media);
        } else {
            System.out.println("Nenhuma temperatura foi informada.");
        }
    }
}