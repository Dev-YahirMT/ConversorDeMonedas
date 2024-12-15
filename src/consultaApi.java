import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;

public class consultaApi {
    public datosConsulta conversion(String modenaOrigen, String monedaDestino, Double monto){

        String apiKey = "--------------------------";
        String url = "https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+modenaOrigen+"/"+monedaDestino+"/"+monto;

        URI direccion = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), datosConsulta.class);

        }catch (Exception e){
            throw new RuntimeException("No se encontro la opción");
        }
    }
}
