package lambda_stepik;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class task_2_6 {

    public static void main(String[] args) {

        List<String> input = Arrays.asList("java", "scala", "java", "clojure", "clojure");


        Function<List<String>, List<String>> find = (x) -> x.stream().distinct().collect(Collectors.toList());

//        input.stream().distinct().collect(Collectors.toList());
//        (x) -> x.stream().distinct().collect(Collectors.toList());


        System.out.println(find.apply(input));



    }



}
