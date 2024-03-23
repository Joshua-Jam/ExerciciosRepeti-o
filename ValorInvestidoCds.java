import java.util.Scanner;

public class ValorInvestidoCds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de CDs na coleção: ");
        int quantidadeCDs = scanner.nextInt();

        double valorTotalInvestido = 0;

        for (int i = 1; i <= quantidadeCDs; i++) {
            System.out.print("Digite o valor do CD " + i + ": R$ ");
            double valorCD = scanner.nextDouble();
            valorTotalInvestido += valorCD;
        }

        double valorMedioPorCD = valorTotalInvestido / quantidadeCDs;

        System.out.println("O valor total investido na coleção de CDs é: R$ " + valorTotalInvestido);
        System.out.println("O valor médio gasto em cada CD é: R$ " + valorMedioPorCD);
    }
}