import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.util.List;
import java.lang.reflect.Type;

class LeituraDeArquivo{
    private List<DiaFaturamento> faturamento;

    public List<DiaFaturamento> getFaturamento() {
        return faturamento;
    }

    public static LeituraDeArquivo fromJson(String filePath) {
        try {
            FileReader reader = new FileReader(filePath);
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            Gson gson = new Gson();
            Type listType = new TypeToken<List<DiaFaturamento>>() {}.getType();
            List<DiaFaturamento> faturamentoLista = gson.fromJson(jsonObject.get("faturamento"), listType);
            LeituraDeArquivo leitura = new LeituraDeArquivo();
            leitura.faturamento = faturamentoLista;
            return leitura;

        } catch (Exception e) {
            System.out.println("Arquivo não encontrado");
            return null;
        }
    }

}