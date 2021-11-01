package lambda_stepik;

import java.util.function.BiFunction;
import java.util.function.Function;

public class task_2_3_2 {

    public static void main(String[] args) {

        int a = 7 % 2;
        System.out.println(a);

        Function<Long, Long> test1 = (x) -> x % 2 > 0 ? x + 1 : x + 2;

        System.out.println(test1.apply(317L));

    }

}
