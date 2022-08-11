package code.JavaReflection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaReflectionTest {

    public static void test() {
        
        ObjectMapper objectMapper = new ObjectMapper();
        List<ClassReflection> list = new ArrayList<>();

        try {
            list = objectMapper.readValue("[{\"program\":\"a\",\"displayOrder\":1},{\"program\":\"b\",\"displayOrder\":2},{\"program\":\"c\",\"displayOrder\":3}]",new TypeReference<List<ClassReflection>>(){});
        } catch (JsonMappingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (JsonProcessingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        System.out.println(list);


/*         String clazzName = "code.JavaReflection.ClassReflection";
        Class<?> clazz = null;
        Class<?> test = null;

        try {
            clazz = Class.forName(clazzName);
            //test = Class.forName("java.util.List");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //System.out.println(clazz);
        System.out.println(test); */

    }
}
