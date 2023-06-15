package creational.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singleton {

    private final Integer[] numbers = {1, 2, 3, 4, 5};
    private final List<Integer> list = Arrays.asList(numbers);
    private static volatile Singleton instance;

    private Singleton() {
        System.out.printf("Object NO %d created\n", this.hashCode());
        Collections.shuffle(list);
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void printData() {
        for (Integer i : list) {
            System.out.print(i.toString() + " ");
        }
        System.out.println();
    }
}
