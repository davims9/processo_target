public class VerificaNumero {
    public static boolean verificaNumero(int numeroDigitado) {
        if (numeroDigitado < 0) {
            return false;
        }
        int a = 0;
        int b = 1;
        while (a < numeroDigitado) {
            int c = a;
            a = b;
            b = c + b;
        }
        return a == numeroDigitado;
    }
}
