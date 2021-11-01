package lambda_stepik;

import java.util.function.BiFunction;
import java.util.function.Function;

public class task_2_3_1 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> test1 = (x,y) -> {
            if (x > y) {return x;}
            else {return y;}
        };

        BiFunction<Integer, Integer, Integer> test2 = (x,y) -> x > y ? x : y;

        System.out.println(test1.apply(1, 4));
        System.out.println(test2.apply(1, 4));

    }

}
