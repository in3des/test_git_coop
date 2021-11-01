package multithreading;

import java.lang.management.BufferPoolMXBean;

public class test01 {

    Thread thread = new Thread();
    Thread thread1 = new Thread();
    Thread thread3 = new Thread();
    Thread thread4 = new Thread();



    static String s = "Git МОЩЬ!";

    public static void main(String[] args) {
        s = "Git неmoshb";
        s = "Test rebase";
        s = "Test rebase2";
        s = "Test rebase3";

        String a = "asd";
    }

}
