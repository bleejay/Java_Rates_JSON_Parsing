import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class RatesFileReaderTests {

    RatesParser ratesParser = new RatesParser("resources/rates.json");

    @Test
    public void testSuccess(){
        Assert.assertEquals("true", ratesParser.getFileSuccess());
    }

    @Test
    public void testTimeStamp(){
        Assert.assertEquals("1539182646", ratesParser.getTimeStamp());
    }

    @Test
    public void testBaseRate(){
        Assert.assertEquals("EUR", ratesParser.getBaseRate());
    }

    @Test
    public void testDate(){
        Assert.assertEquals("2018-10-10", ratesParser.getDate());
    }

    @Test
    public void testNumberOfRates(){
        Assert.assertEquals(168,ratesParser.getRate().size());
    }


    //This test is Not correct, need to work out how to test for duplicates within JSON file itself
    @Test
    public void testForDuplicates() {

        JSONObject rates = ratesParser.getRate();
        Object[] rateKeys = rates.keySet().toArray();

        System.out.println(rates.get("ZWL"));

        System.out.println(rates.size());
        System.out.println(rates.keySet().size());
        System.out.println(rates.toString());

//        HashMap<Object, Object> RatesMap = new HashMap();
//        for (int i = 0; i <rateKeys.length ; i++) {
//            RatesMap.put(rateKeys[i], rates.get(rateKeys[i]));
//        }
//        Assert.assertEquals(rateKeys.length, rates.size());

//        for (int i = 0; i < rateKeys.length; i++){
//            for (int j = rateKeys.length - 1; j > 0; j--) {
//                Assert.assertFalse(rateKeys[i] == rateKeys[j]);
//            }
//        }
//        Assert.assertTrue("loop completed", );
    }
}



