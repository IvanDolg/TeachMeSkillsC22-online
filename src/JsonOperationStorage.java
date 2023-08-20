import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class JsonOperationStorage implements OperationStorage{
    private final String path = "src/DocFile/JsonHistory.json";
    private final Type jsonListTypeToken = new TypeToken<List<Operation>>(){}.getType();
    private final Gson gson =  new Gson();
    public JsonOperationStorage() {}
    @Override
    public void save(Operation operation) {
        List<Operation> all = findAll();
        if (all == null)
            all = new ArrayList<>();

        all.add(operation);

        String jsonData = gson.toJson(all);

        try (FileWriter fileWriter = new FileWriter(path, false)) {
            fileWriter.write(jsonData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Operation> findAll() {
        String jsonOperationData;

        try {
            jsonOperationData = Files.readString(Path.of(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return gson.fromJson(jsonOperationData, jsonListTypeToken);
    }
}
