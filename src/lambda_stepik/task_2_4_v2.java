package lambda_stepik;

import java.util.Arrays;

public class task_2_4_v2 {

    public static void main(String[] args) {
        String[] str1 = {"a","b","c","d","e","f","g"};

        SevenV2<String> strings2 = (a, b, c, d, e, f, g) -> (a+b+c+d+e+f+g).toUpperCase();

        SevenV1<String> strings1 = (a) -> Arrays.stream(a).reduce((s1, s2) -> s1 + s2).get().toUpperCase();

        SevenV1<String> strings11 = (a) -> String.valueOf(Arrays.stream(a).reduce((s1, s2) -> s1 + s2));

        SevenV1<String> strings111 = (a) -> (Arrays.stream(a).reduce((s1, s2) -> s1 + s2)).get();

        SevenV1<String> strings1111 = (a) -> Arrays.stream(a).reduce("", (s1, s2) -> s1 + s2).toUpperCase();

        System.out.println(strings2.sevenConcatV2("a","b","c","d","e","f","g"));
        System.out.println(strings1.sevenConcatV1(str1));
        System.out.println(strings11.sevenConcatV1(str1));
        System.out.println(strings111.sevenConcatV1(str1));
        System.out.println(strings1111.sevenConcatV1(str1));
    }

    @FunctionalInterface
    interface SevenV1<T> {
        T sevenConcatV1(T... t);
    }

    @FunctionalInterface
    interface SevenV2<T> {
        T sevenConcatV2(T a, T b, T c, T d, T e, T f, T g);
    }


}
