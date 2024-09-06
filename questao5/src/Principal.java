import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string para inverter:");
        String stringDigitada = scanner.nextLine();

        InverteString inverter = new InverteString();
        String resultado = inverter.inverter(stringDigitada);

        System.out.println("String invertida: " + resultado);
    }
}