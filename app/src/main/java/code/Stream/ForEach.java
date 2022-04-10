package code.Stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ForEach {
    
    public static void test() {
        
        List<String> test = new LinkedList<>(Arrays.asList("a", "b", "c", "d"));

        System.out.println(test);

        test.clear();

        System.out.println(test);
    }
}
