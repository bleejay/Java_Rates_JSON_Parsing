import org.json.simple.JSONObject;

public class RatesParser {

    JSONObject ratesFile;

    public RatesParser(String filePath) {
        RatesFileReader ratesFileReader = new RatesFileReader(filePath);
        ratesFile = ratesFileReader.getFullJsonFile();
    }

    //getters
    private Object getJSONValue(String key){return ratesFile.get(key);}
    public String getFileSuccess(){return getJSONValue("success").toString();}
    public String getTimeStamp(){return getJSONValue("timestamp").toString();}
    public String getBaseRate(){return getJSONValue("base").toString();}
    public String getDate(){return getJSONValue("date").toString();}
    public JSONObject getRate(){return (JSONObject) getJSONValue("rates");}


}
