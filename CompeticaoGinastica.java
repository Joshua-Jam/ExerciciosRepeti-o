import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompeticaoGinastica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do ginasta: ");
        String nome = scanner.nextLine();

        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
        }

        double melhorNota = Collections.max(notas);
        double piorNota = Collections.min(notas);

        // Removendo a melhor e a pior nota
        notas.remove(melhorNota);
        notas.remove(piorNota);

        // Calculando a média das notas restantes
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();

        System.out.println("\nResultado final:");
        System.out.println("Atleta: " + nome);
        System.out.println("Melhor nota: " + melhorNota);
        System.out.println("Pior nota: " + piorNota);
        System.out.println("Média: " + String.format("%.2f", media));

        scanner.close();
    }
}