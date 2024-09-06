public class InverteString {
    public String inverter(String entrada) {
        char[] caracteres = entrada.toCharArray();
        String invertida = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }
        return invertida;
    }
}
