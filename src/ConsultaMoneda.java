import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class ConsultaMoneda {
    public Moneda buscaMoneda (String moneda){
        URI direccion =  URI.create("https://v6.exchangerate-api.com/v6/a613d999f3f5aa4584c92f21/latest/" + moneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        //String json = response.body();
        //System.out.println(json);
        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
        JsonObject rates = json.getAsJsonObject("conversion_rates");
        String usd = String.valueOf(rates.get("USD").getAsDouble());
        String ars = String.valueOf(rates.get("ARS").getAsDouble());
        String brl = String.valueOf(rates.get("BRL").getAsDouble());
        String cop = String.valueOf(rates.get("COP").getAsDouble());

        return new Moneda(usd, ars, brl, cop);
        }
        catch (Exception e) {
            throw new RuntimeException("No se pudo obtener la moneda: " + moneda, e);
        }
    }
}