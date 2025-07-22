import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ConsultaMoneda {
    public Moneda buscaMoneda (String moneda){
        URI direccion =  URI.create("https://v6.exchangerate-api.com/v6/a613d999f3f5aa4584c92f21/latest/" + moneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), Moneda.class);
        }
        catch (Exception e) {
            throw new RuntimeException("No se pudo obtener la moneda: " + moneda, e);
        }
    }
}