package code.Jackson.SuperClassJsonRepresentation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
    
    public static void test(){

        DTOTest dtoTest = new DTOTest();
        ObjectMapper objectMapper = new ObjectMapper();
        
        dtoTest.setName("test");
        dtoTest.setAge(10L);

        String test = null;
        try {
            test = objectMapper.writeValueAsString(dtoTest);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(test);
    }
}
