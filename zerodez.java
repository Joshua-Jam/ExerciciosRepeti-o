import java.util.Scanner;

public class NotaBizarra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Fala uma nota entre zero e dez: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Não bosta. ENTRE ZERO E DEZ, CEGO");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Boa, a nota é: " + nota);
    }
}