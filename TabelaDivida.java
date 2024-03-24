import java.text.DecimalFormat;

public class TabelaDivida {
    public static void main(String[] args) {
        double valorDivida = 1000.0;
        double valorJuros;
        int quantidadeParcelas;
        double valorParcela;
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.println("Valor da Dívida   Valor dos Juros   Quantidade de Parcelas   Valor da Parcela");

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    valorJuros = 0;
                    quantidadeParcelas = 1;
                    break;
                case 1:
                    valorJuros = valorDivida * 0.10;
                    quantidadeParcelas = 3;
                    break;
                case 2:
                    valorJuros = valorDivida * 0.15;
                    quantidadeParcelas = 6;
                    break;
                case 3:
                    valorJuros = valorDivida * 0.20;
                    quantidadeParcelas = 9;
                    break;
                case 4:
                    valorJuros = valorDivida * 0.25;
                    quantidadeParcelas = 12;
                    break;
                default:
                    valorJuros = 0;
                    quantidadeParcelas = 0;
                    break;
            }

            valorDivida += valorJuros;
            valorParcela = valorDivida / quantidadeParcelas;

            System.out.printf("%s   %s   %d   %s%n",
                    df.format(valorDivida), df.format(valorJuros),
                    quantidadeParcelas, df.format(valorParcela));
        }
    }
}