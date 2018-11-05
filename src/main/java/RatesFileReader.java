import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class RatesFileReader {

    JSONObject fullJsonFile = new JSONObject();

    public RatesFileReader(String FilePath) {

        try {
            Reader ratesJSONFile = new FileReader(FilePath);
            JSONParser parser = new JSONParser();
            Object ratesObj = parser.parse(ratesJSONFile);
            fullJsonFile = (JSONObject) ratesObj;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JSONObject getFullJsonFile() {
        return fullJsonFile;
    }
}
