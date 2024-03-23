import java.util.Scanner;

public class MediaAlunosTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int quantidadeTurmas = scanner.nextInt();

        int totalAlunos = 0;

        for (int i = 1; i <= quantidadeTurmas; i++) {
            int alunosPorTurma;
            do {
                System.out.print("Digite a quantidade de alunos para a turma " + i + " (não mais que 40): ");
                alunosPorTurma = scanner.nextInt();
            } while (alunosPorTurma < 0 || alunosPorTurma > 40);

            totalAlunos += alunosPorTurma;
        }

        double mediaAlunosPorTurma = (double) totalAlunos / quantidadeTurmas;

        System.out.println("O número médio de alunos por turma é: " + mediaAlunosPorTurma);
    }
}