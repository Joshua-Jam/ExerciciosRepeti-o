import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("Entre com as informações para os países:");
            int populacaoA, populacaoB;
            double taxaCrescimentoA, taxaCrescimentoB;

            do {
                System.out.print("População do país A (maior que zero): ");
                populacaoA = scanner.nextInt();
            } while (populacaoA <= 0);

            do {
                System.out.print("Taxa de crescimento do país A (em decimal, por exemplo, 0.03 para 3%): ");
                taxaCrescimentoA = scanner.nextDouble();
            } while (taxaCrescimentoA <= 0 || taxaCrescimentoA >= 1);

            do {
                System.out.print("População do país B (maior que zero): ");
                populacaoB = scanner.nextInt();
            } while (populacaoB <= 0);

            do {
                System.out.print("Taxa de crescimento do país B (em decimal, por exemplo, 0.015 para 1.5%): ");
                taxaCrescimentoB = scanner.nextDouble();
            } while (taxaCrescimentoB <= 0 || taxaCrescimentoB >= 1);

            int anos = calcularAnos(populacaoA, populacaoB, taxaCrescimentoA, taxaCrescimentoB);

            System.out.println("Número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B: " + anos);

            System.out.print("Deseja repetir a operação? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
    }

    public static int calcularAnos(int populacaoA, int populacaoB, double taxaCrescimentoA, double taxaCrescimentoB) {
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaCrescimentoA;
            populacaoB += populacaoB * taxaCrescimentoB;
            anos++;
        }

        return anos;
    }
}