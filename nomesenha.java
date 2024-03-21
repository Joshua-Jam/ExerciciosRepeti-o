import java.util.Scanner;

public class SenhaBizarra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario, senha;

        do {
            System.out.print("Fala um nome: ");
            nomeUsuario = scanner.nextLine();

            System.out.print("Fala uma senha: ");
            senha = scanner.nextLine();

            if (senha.equals(nomeUsuario)) {
                System.out.println("NÃO NÉ BOSTA, FAZ DIFERENTE!");
            }
        } while (senha.equals(nomeUsuario));

        System.out.println("Boa!");
    }
}