package lambda_stepik;

public class task_2_8 {

    public static void main(String[] args) {

        String prefix = "aaa";
        String suffix = "zzz";



        PrefixSuffix<String> func1 = (a, b, c) -> a.concat(c.trim()).concat(b);

        System.out.println(func1.AddPS(prefix, suffix, "  fgdhgfhsd   "));


    }

    @FunctionalInterface
    interface PrefixSuffix<T> {
        String AddPS (T a, T b, T c);
    }

}
