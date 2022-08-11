package code.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingLastElement {

    public static void test() {
        try {

            List<String> test = Arrays.asList("a%b%c", "a%b%c", "a%b%c", "a%b%c", "a%b%c", "d%e%f");

            List<String> result = test.stream().map(uniqueKey -> {
                List<String> test2 = new ArrayList(Arrays.asList(uniqueKey.split("%")));
                int lastElementIndex = test2.size() - 1;
                
                test2.remove(lastElementIndex);

                return test2.stream().collect(Collectors.joining("%"));
            }).collect(Collectors.toList());



            System.out.println(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
