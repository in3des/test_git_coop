package multithreading;

import java.util.ArrayList;
import java.util.List;

public class test01 {

    Thread thread = new Thread();
    Thread thread1 = new Thread();
    Thread thread3 = new Thread();
    Thread thread4 = new Thread();



    static String s = "Git МОЩЬ!";

    public static void main(String[] args) {
        s = "Git неmoshb";
    }

    List<String> list1 = new ArrayList<>();
    {
        list1.add(s);
    }

}
