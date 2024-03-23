import java.util.Scanner;

public class ValidacaoInformacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        // Validação do nome
        do {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        // Validação da idade
        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        // Validação do salário
        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        // Validação do sexo
        do {
            System.out.print("Digite o sexo (f ou m): ");
            sexo = scanner.next().toLowerCase();
        } while (!sexo.equals("f") && !sexo.equals("m"));

        // Validação do estado civil
        do {
            System.out.print("Digite o estado civil (s, c, v ou d): ");
            estadoCivil = scanner.next().toLowerCase();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v")
                && !estadoCivil.equals("d"));

        // Exibindo as informações validadas
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}