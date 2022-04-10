
package code;

import code.Jackson.NullObjectPattern;
import code.Stream.ForEach;

public class App {

    public static void main(String[] args) throws InterruptedException{
        
        int i = 5;

        i -= 1;

        System.out.println(i);
        Thread.sleep(1);
        System.out.println(i);

    }
}
