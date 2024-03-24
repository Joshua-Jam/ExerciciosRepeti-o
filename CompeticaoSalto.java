import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompeticaoSalto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> saltos = new ArrayList<>();

        while (true) {
            System.out.print("Nome do atleta (ou Enter para sair): ");
            String nome = scanner.nextLine();

            if (nome.isEmpty()) {
                break;
            }

            System.out.println("Informe os cinco saltos do atleta " + nome + ":");

            for (int i = 0; i < 5; i++) {
                System.out.print("Salto " + (i + 1) + ": ");
                double salto = scanner.nextDouble();
                saltos.add(salto);
            }

            double melhorSalto = Collections.max(saltos);
            double piorSalto = Collections.min(saltos);
            double soma = 0;

            for (Double salto : saltos) {
                soma += salto;
            }

            double media = (soma - melhorSalto - piorSalto) / 3;

            System.out.println("\nResultado final:");
            System.out.println(nome + ": " + String.format("%.2f", media) + " m\n");

            // Limpa a lista para o próximo atleta
            saltos.clear();
            scanner.nextLine(); // Limpa o buffer do scanner
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}