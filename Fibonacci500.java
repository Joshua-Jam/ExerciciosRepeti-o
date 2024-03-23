public class Fibonacci500 {
    public static void main(String[] args) {
        int limite = 500;
        int fib1 = 0;
        int fib2 = 1;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500:");
        while (fib1 <= limite) {
            System.out.print(fib1 + " ");
            int proximo = fib1 + fib2;
            fib1 = fib2;
            fib2 = proximo;
        }
    }
}