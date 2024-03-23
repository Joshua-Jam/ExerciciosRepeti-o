import java.util.Scanner;

public class CaixaRegistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorProdutos = 0;
        double totalCompra = 0;

        System.out.println("Lojas Tabajara");

        double precoProduto;
        do {
            contadorProdutos++;
            System.out.print("Produto " + contadorProdutos + ": R$ ");
            precoProduto = scanner.nextDouble();
            totalCompra += precoProduto;
        } while (precoProduto != 0);

        System.out.println("Total: R$ " + String.format("%.2f", totalCompra));

        System.out.print("Dinheiro: R$ ");
        double dinheiro = scanner.nextDouble();

        double troco = dinheiro - totalCompra;
        System.out.println("Troco: R$ " + String.format("%.2f", troco));
    }
}