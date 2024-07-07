package tomiks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(5);
            add(2);
            add(6);
            add(3);
            add(51);
            add(25);
            add(56);
            add(51);
            add(50);
        }};
        System.out.println(CollectionExpand.countEven(list));
    }
}