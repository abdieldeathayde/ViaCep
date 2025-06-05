import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConsultaCep {
    public static Endereco buscaEndereco(String cep) throws Exception {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setRequestMethod("GET");

        if (con.getResponseCode() != 200) {
            throw new RuntimeException("Erro na requisição: " + con.getResponseCode());
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder resposta = new StringBuilder();
        String linha;
        while ((linha = in.readLine()) != null) {
            resposta.append(linha);
        }
        in.close();

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(resposta.toString(), Endereco.class);
    }
}
