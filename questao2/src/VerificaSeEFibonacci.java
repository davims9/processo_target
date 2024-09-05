import java.util.Scanner;

public class VerificaSeEFibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numeroDigitado = scanner.nextInt();
        scanner.close();
    
        if (VerificaNumero.verificaNumero(numeroDigitado)) {
            System.out.println("O número " + numeroDigitado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroDigitado + " não pertence à sequência de Fibonacci.");
        }
    }
    
}
