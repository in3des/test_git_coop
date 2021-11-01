package test1;

import java.util.stream.Stream;

public class StreamEx01 {

    public static void main(String[] args) {


        int int1 = Stream
                .of(5, 3, 4, 55, 2)
                .mapToInt(a -> a)
                .min()
                .getAsInt(); //2
        System.out.println(int1);

        int int2 = Stream
                .of(5, 3, 4, 55, 2)
                .mapToInt(a -> a)
                .sum(); //69
        System.out.println(int2);

    }


}
