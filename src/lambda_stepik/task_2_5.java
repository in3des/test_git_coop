package lambda_stepik;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.LongStream;

public class task_2_5 {

    public static void main(String[] args) {

        Long l1 = 2L;
        Long l2 = 2L;

        BiFunction<Long, Long, Long> test1 = (x, y) -> LongStream.rangeClosed(x, y).reduce(1L, (v, s) -> v * s);
        System.out.println(test1.apply(l1, l2));

//        LongStream.rangeClosed(2, 2).reduce(1L, (v, s) -> v * s);

    }



}
