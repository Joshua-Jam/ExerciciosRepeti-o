import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cardápio:");
        System.out.println("Especificação   Código  Preço");
        System.out.println("Cachorro Quente 100     R$ 1,20");
        System.out.println("Bauru Simples   101     R$ 1,30");
        System.out.println("Bauru com ovo   102     R$ 1,50");
        System.out.println("Hambúrguer      103     R$ 1,20");
        System.out.println("Cheeseburguer   104     R$ 1,30");
        System.out.println("Refrigerante    105     R$ 1,00");

        double totalPedido = 0;

        while (true) {
            System.out.print("\nDigite o código do item (ou -1 para encerrar o pedido): ");
            int codigo = scanner.nextInt();

            if (codigo == -1) {
                break;
            }

            double preco = 0;
            String especificacao = "";

            switch (codigo) {
                case 100:
                    preco = 1.20;
                    especificacao = "Cachorro Quente";
                    break;
                case 101:
                    preco = 1.30;
                    especificacao = "Bauru Simples";
                    break;
                case 102:
                    preco = 1.50;
                    especificacao = "Bauru com ovo";
                    break;
                case 103:
                    preco = 1.20;
                    especificacao = "Hambúrguer";
                    break;
                case 104:
                    preco = 1.30;
                    especificacao = "Cheeseburguer";
                    break;
                case 105:
                    preco = 1.00;
                    especificacao = "Refrigerante";
                    break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }

            System.out.print("Digite a quantidade desejada: ");
            int quantidade = scanner.nextInt();

            double valorItem = preco * quantidade;
            totalPedido += valorItem;

            System.out.println("Item: " + especificacao);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor do item: R$ " + valorItem);
        }

        System.out.println("\nTotal do pedido: R$ " + totalPedido);
    }
}