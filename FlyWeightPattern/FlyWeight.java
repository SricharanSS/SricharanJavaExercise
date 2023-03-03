package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyWeight {
    static Map<String, FlyWeight> studTypes = new HashMap<>();
    String className;
    String courseType;
    int courseID;

    static public FlyWeight getType(String className, String courseType, int courseID) {
        FlyWeight result = studTypes.get(className);
        if(result == null) {
            FlyWeight temp = new FlyWeight();
            temp.className = className;
            temp.courseType = courseType;
            temp.courseID = courseID;
            studTypes.put(className, temp);
            return temp;
        }
        return result;
    }
}
