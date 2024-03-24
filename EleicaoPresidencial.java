import java.util.Scanner;

public class EleicaoPresidencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0, votosCandidato4 = 0;
        int votosNulos = 0, votosBrancos = 0, totalVotos = 0;

        System.out.println("Códigos dos candidatos:");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");
        System.out.println("4 - Candidato 4");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");

        while (true) {
            System.out.print("\nDigite o código do voto (ou 0 para encerrar): ");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Código de voto inválido!");
                    continue;
            }

            if (voto == 0) {
                break;
            }

            totalVotos++;
        }

        double percentualVotosNulos = (double) votosNulos / totalVotos * 100;
        double percentualVotosBrancos = (double) votosBrancos / totalVotos * 100;

        System.out.println("\nResultado da Eleição:");
        System.out.println("Total de votos para o Candidato 1: " + votosCandidato1);
        System.out.println("Total de votos para o Candidato 2: " + votosCandidato2);
        System.out.println("Total de votos para o Candidato 3: " + votosCandidato3);
        System.out.println("Total de votos para o Candidato 4: " + votosCandidato4);
        System.out.println("Total de votos Nulos: " + votosNulos);
        System.out.println("Total de votos em Branco: " + votosBrancos);
        System.out.printf("Percentual de votos Nulos sobre o total de votos: %.2f%%\n", percentualVotosNulos);
        System.out.printf("Percentual de votos em Branco sobre o total de votos: %.2f%%\n", percentualVotosBrancos);
    }
}