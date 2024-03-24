import java.util.Scanner;

public class VerificacaoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o gabarito da prova
        String[] gabarito = new String[] { "A", "B", "C", "D", "E", "E", "D", "C", "B", "A" };

        // Variáveis para armazenar estatísticas
        int maiorAcerto = 0, menorAcerto = 10;
        int totalAlunos = 0, totalPontos = 0;

        // Loop para processar cada aluno
        while (true) {
            // Variável para contar os acertos do aluno
            int acertos = 0;

            // Perguntando ao aluno as respostas
            System.out.println("Respostas do aluno:");

            // Comparando as respostas do aluno com o gabarito
            for (int i = 0; i < 10; i++) {
                System.out.print("Questão " + (i + 1) + ": ");
                String resposta = scanner.next();

                if (resposta.equalsIgnoreCase(gabarito[i])) {
                    acertos++;
                }
            }

            // Atualizando estatísticas
            totalAlunos++;
            totalPontos += acertos;

            // Atualizando maior e menor acerto
            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }
            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }

            // Verificando se há outro aluno
            System.out.print("\nOutro aluno vai utilizar o sistema? (s/n): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        // Calculando média das notas da turma
        double mediaNotas = (double) totalPontos / totalAlunos;

        // Exibindo resultados
        System.out.println("\nResultados:");
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
        System.out.println("Média das notas da turma: " + mediaNotas);
    }
}