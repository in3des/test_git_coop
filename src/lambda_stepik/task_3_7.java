package lambda_stepik;

import java.util.List;
import java.util.function.IntPredicate;

public class task_3_7 {

    public static void main(String[] args) {

        String prefix = "aaa";
        String suffix = "zzz";



        PrefixSuffix<String> func1 = (a, b, c) -> a.concat(c.trim()).concat(b);

        System.out.println(func1.AddPS(prefix, suffix, "  fgdhgfhsd   "));




    }

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
//        return predicates.stream().reduce(x->false, (x,y) -> x.or(y));
        return predicates.stream().reduce(x->false, IntPredicate::or);
    }

    @FunctionalInterface
    interface PrefixSuffix<T> {
        String AddPS (T a, T b, T c);
    }

}
