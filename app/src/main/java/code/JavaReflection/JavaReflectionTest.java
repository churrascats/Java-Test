package code.JavaReflection;

public class JavaReflectionTest {
    
    public static void test() {
        
        String clazzName = "code.JavaReflection.ClassReflection";
        Class<?> clazz = null;
        Class<?> test = null;

        try {
            clazz = Class.forName(clazzName);
            test = Class.forName("java.util.List<code.JavaReflection.ClassReflection>");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //System.out.println(clazz);
        System.out.println(test);

    }
}
