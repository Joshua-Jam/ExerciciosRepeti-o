import java.util.Scanner;

public class AnaliseAcademia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
        double alturaMaisAlto = Double.MIN_VALUE, alturaMaisBaixo = Double.MAX_VALUE;
        double pesoMaisGordo = Double.MIN_VALUE, pesoMaisMagro = Double.MAX_VALUE;
        double somaAlturas = 0, somaPesos = 0;
        int quantidadeClientes = 0;

        while (true) {
            System.out.print("Digite o código do cliente (ou 0 para encerrar): ");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.print("Digite a altura do cliente (em metros): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso do cliente (em quilogramas): ");
            double peso = scanner.nextDouble();

            somaAlturas += altura;
            somaPesos += peso;
            quantidadeClientes++;

            // Verifica se é o mais alto
            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                codigoMaisAlto = codigo;
            }

            // Verifica se é o mais baixo
            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                codigoMaisBaixo = codigo;
            }

            // Verifica se é o mais gordo
            if (peso > pesoMaisGordo) {
                pesoMaisGordo = peso;
                codigoMaisGordo = codigo;
            }

            // Verifica se é o mais magro
            if (peso < pesoMaisMagro) {
                pesoMaisMagro = peso;
                codigoMaisMagro = codigo;
            }
        }

        if (quantidadeClientes > 0) {
            double mediaAlturas = somaAlturas / quantidadeClientes;
            double mediaPesos = somaPesos / quantidadeClientes;

            System.out.println("\nCliente mais alto:");
            System.out.println("Código: " + codigoMaisAlto);
            System.out.println("Altura: " + alturaMaisAlto + " metros");

            System.out.println("\nCliente mais baixo:");
            System.out.println("Código: " + codigoMaisBaixo);
            System.out.println("Altura: " + alturaMaisBaixo + " metros");

            System.out.println("\nCliente mais gordo:");
            System.out.println("Código: " + codigoMaisGordo);
            System.out.println("Peso: " + pesoMaisGordo + " quilogramas");

            System.out.println("\nCliente mais magro:");
            System.out.println("Código: " + codigoMaisMagro);
            System.out.println("Peso: " + pesoMaisMagro + " quilogramas");

            System.out.println("\nMédia das alturas dos clientes: " + mediaAlturas + " metros");
            System.out.println("Média dos pesos dos clientes: " + mediaPesos + " quilogramas");
        } else {
            System.out.println("Nenhum cliente foi registrado.");
        }
    }
}