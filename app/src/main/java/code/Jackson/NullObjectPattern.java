package code.Jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NullObjectPattern {
    
    public static void test(){
        ObjectMapper mapper = new ObjectMapper();

        String newString = "{\"nick\": \"cowtowncoder\"}";
        try {
            JsonNode newNode = mapper.readTree(newString);

            System.out.println(newNode.get("sdsd") == null);

            Object test = null;    

            Long teste2 = (Long) test;

            System.out.println(teste2);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
