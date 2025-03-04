import java.util.HashMap;
import java.util.Map;

class map {
    public static void main(String [] args){
        Map<String,Integer>country = new HashMap<>();
        System.out.println("Countries details");
        System.out.println("========");
        country.put("India",1);
        country.put("USA",2);
        country.put("Australia",3);
        country.remove(2);
        System.out.println(country);

        for(Map.Entry<String,Integer>entry : country.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
