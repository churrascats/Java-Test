package code.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemovingDuplicates {
    
    public static void test() {
    
        List<String> test = Arrays.asList("a", "a", "a", "a", "b", "b", "b", "a", "c","c","c","c","d","e","e");

        List<String> uniqueKeys = test.stream().distinct().collect(Collectors.toList());

        System.out.println(test);

        System.out.println(uniqueKeys);
    
    }
}
