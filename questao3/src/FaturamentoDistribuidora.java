import java.util.List;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        try{
            LeituraDeArquivo valoresFaturamento = LeituraDeArquivo.fromJson("questao3/faturamento.json");
            List<DiaFaturamento> faturamento = valoresFaturamento.getFaturamento();

            double menorValorFaturado = Double.MAX_VALUE;
            double maiorValorFaturado = 0;
            int diaMenorValor = 0;
            int diaMaiorValor = 0;
            double somaValoresFaturados = 0;
            int diasComFaturamento = 0;
            double mediaFaturamento = 0;
            int diasFaturamentoAcimaDaMedia = 0;

            for (DiaFaturamento dia : faturamento) {
                double valor = dia.getValor();
                int diaFaturado = dia.getDia();

                if (valor > 0) {
                    if (valor > maiorValorFaturado) {
                        maiorValorFaturado = valor;
                        diaMaiorValor = diaFaturado;
                    }
                    if (valor < menorValorFaturado) {
                        menorValorFaturado = valor;
                        diaMenorValor = diaFaturado;
                    }
                    somaValoresFaturados += valor;
                    diasComFaturamento++;
                }
            }

            mediaFaturamento = somaValoresFaturados / diasComFaturamento;


            for (DiaFaturamento dia : faturamento) {
                double valor = dia.getValor();
                if (valor > 0 && valor > mediaFaturamento) {
                    diasFaturamentoAcimaDaMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + menorValorFaturado +" no dia " +diaMenorValor);
            System.out.println("Maior valor de faturamento: " + maiorValorFaturado +" no dia " +diaMaiorValor);
            System.out.println("Número de dias com faturamento acima da média: " + diasFaturamentoAcimaDaMedia);

        } catch (Exception e) {
            System.out.println("Favor verificar o arquivo, o mesmo pode estar vazio ou fora do padrão!");
        }

    }
}