import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário inicial do funcionário: R$ ");
        double salarioInicial = scanner.nextDouble();

        int anoAtual = 2024;
        int anoContratacao = 1995;
        double percentualAumento = 0.015; // 1.5%

        double salario = salarioInicial;

        for (int ano = anoContratacao + 1; ano <= anoAtual; ano++) {
            percentualAumento *= 2; // Aumento dobro do percentual do ano anterior
            salario += salario * percentualAumento; // Calcula o novo salário com o aumento
        }

        System.out.println("O salário atual do funcionário em " + anoAtual + " é de R$ " + salario);
    }
}