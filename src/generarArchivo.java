import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class generarArchivo {
    public void guardarJson(conversion conversionMoneda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter("historial.json");
        escritura.write(gson.toJson(conversionMoneda));
        escritura.close();
    }
}
