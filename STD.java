import java.util.HashMap;
import java.util.Map;

/**
 * String to dictionary, dictionary to string
 *
 * Dict = Dictionary
 * */
public class STD
{
    /**
     * SI = String, Integer
     */
    public static String SIDictToString(Map<String, Integer> dictionary)
    {
        StringBuilder stringedDict = new StringBuilder();
        for(String key : dictionary.keySet())
        {
            stringedDict.append(key).append(":").append(dictionary.get(key)).append(",");
        }

        return stringedDict.toString();
    }

    /**
     * SI = String, Integer
     */
    public static Map<String, Integer> SIStringToDict(String string)
    {
        Map<String, Integer> remappedDict = new HashMap<>();
        String[] keysAndValues = string.split(",");

        for(String keyAndValue : keysAndValues)
        {
            //KAV = Key and Value
            String[] splitKAV = keyAndValue.split(":");
            remappedDict.put(splitKAV[0], Integer.valueOf(splitKAV[1]));
        }

        return remappedDict;
    }
}
