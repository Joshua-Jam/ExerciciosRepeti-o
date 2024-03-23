public class TabelaPrecos {
    public static void main(String[] args) {
        System.out.println("Lojas Quase Dois - Tabela de preços");
        for (int i = 1; i <= 50; i++) {
            double preco = i * 1.99;
            System.out.println(i + " - R$ " + String.format("%.2f", preco));
        }
    }
}