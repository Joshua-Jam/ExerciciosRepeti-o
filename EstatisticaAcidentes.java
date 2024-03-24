import java.util.Scanner;

public class EstatisticaAcidentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCidadeMaisAcidentes = 0, codigoCidadeMenosAcidentes = 0;
        int maiorIndiceAcidentes = Integer.MIN_VALUE, menorIndiceAcidentes = Integer.MAX_VALUE;
        int totalVeiculos = 0, totalCidadesMenos2000Veiculos = 0;
        int totalAcidentesCidadesMenos2000Veiculos = 0;
        int totalCidades = 5;

        for (int i = 1; i <= totalCidades; i++) {
            System.out.println("Cidade " + i + ":");

            System.out.print("Digite o código da cidade: ");
            int codigoCidade = scanner.nextInt();

            System.out.print("Digite o número de veículos de passeio em 1999: ");
            int numVeiculos = scanner.nextInt();
            totalVeiculos += numVeiculos;

            System.out.print("Digite o número de acidentes de trânsito com vítimas em 1999: ");
            int numAcidentes = scanner.nextInt();

            if (numAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = numAcidentes;
                codigoCidadeMaisAcidentes = codigoCidade;
            }

            if (numAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = numAcidentes;
                codigoCidadeMenosAcidentes = codigoCidade;
            }

            if (numVeiculos < 2000) {
                totalCidadesMenos2000Veiculos++;
                totalAcidentesCidadesMenos2000Veiculos += numAcidentes;
            }
        }

        double mediaVeiculos = (double) totalVeiculos / totalCidades;
        double mediaAcidentesCidadesMenos2000Veiculos = 0;
        if (totalCidadesMenos2000Veiculos > 0) {
            mediaAcidentesCidadesMenos2000Veiculos = (double) totalAcidentesCidadesMenos2000Veiculos
                    / totalCidadesMenos2000Veiculos;
        }

        System.out.println("\nCidade com maior índice de acidentes: " + codigoCidadeMaisAcidentes + ", com "
                + maiorIndiceAcidentes + " acidentes");
        System.out.println("Cidade com menor índice de acidentes: " + codigoCidadeMenosAcidentes + ", com "
                + menorIndiceAcidentes + " acidentes");
        System.out.println("Média de veículos nas cinco cidades juntas: " + mediaVeiculos);
        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: "
                + mediaAcidentesCidadesMenos2000Veiculos);
    }
}