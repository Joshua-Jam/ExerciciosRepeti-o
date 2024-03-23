import java.util.Scanner;

public class ClassificacaoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas na turma: ");
        int quantidadePessoas = scanner.nextInt();

        int somaIdades = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;

        System.out.println("A média de idade da turma é: " + mediaIdades);

        if (mediaIdades >= 0 && mediaIdades <= 25) {
            System.out.println("A turma é jovem.");
        } else if (mediaIdades <= 60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }
    }
}