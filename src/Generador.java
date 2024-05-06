import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Generador {

    public void generararchivo (Moneda moneda) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter(moneda.toString() + ".json");
        writer.write(gson.toJson(moneda));
        writer.close();
    }
}
