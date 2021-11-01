package lambda_stepik;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class task_4_4 {

    public static void main(String[] args) {

        final Long l1 = 6L;
//
////
        Function<Long, Boolean> test1 = (x) -> LongStream.rangeClosed(2L, x / 2).noneMatch(i -> x % i == 0);
        System.out.println(test1.apply(l1));
//        System.out.println(3%3);
//        long count = LongStream.rangeClosed(2L, l1).map(s -> l1 % s).sorted().filter(s -> s == 0).count();
////        if(count == 1){
//            System.out.println(true);
//        } else System.out.println(false);

//        LongStream.rangeClosed(2, 2).reduce(1L, (v, s) -> v * s);
//        System.out.println(isPrime(3571));
//
//    }
//    public static boolean isPrime(int number) {
//        return !LongStream.range(2, number).anyMatch(i -> number%i == 0);
//    }


    }

}
