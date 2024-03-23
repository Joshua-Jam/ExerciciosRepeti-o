import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        int[] votos = new int[3]; // Um array para armazenar os votos de cada candidato

        for (int i = 0; i < totalEleitores; i++) {
            System.out.println("Eleitor " + (i + 1) + ":");
            System.out.println("Digite o número do candidato (1, 2 ou 3): ");
            int voto = scanner.nextInt();

            // Verifica se o voto é válido (entre 1 e 3)
            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++; // Incrementa o contador de votos do candidato correspondente
            } else {
                System.out.println("Voto inválido. Por favor, vote novamente.");
                i--; // Volta para o mesmo eleitor para que ele vote novamente
            }
        }

        // Exibe o número de votos de cada candidato
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos");
        }
    }
}