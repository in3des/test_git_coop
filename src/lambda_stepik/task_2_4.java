package lambda_stepik;

import java.util.function.Function;

public class task_2_4 {

    public static void main(String[] args) {

        Seven<String, String, String, String, String, String, String> strings = (a,b,c,d,e,f,g) -> (a+b+c+d+e+f+g).toUpperCase();

//        SevenTwo<String> strings2 = (a,b,c,d,e,f,g) -> (a+b+c+d+e+f+g).toUpperCase();

        SevenThree<String> strings3 = (a,b,c,d,e,f,g) -> (a+b+c+d+e+f+g).toUpperCase();

    }

    @FunctionalInterface
    interface Seven<A,B,C,D,E,F,G> {
        String sevenConcat(A a, B b, C c, D d, E e, F f, G g);
    }

//    @FunctionalInterface
//    interface SevenTwo<T> {
//        T sevenConcatTwo(T... t);
//    }

    @FunctionalInterface
    interface SevenThree<T> {
        T sevenConcatThree(T a, T b, T c, T d, T e, T f, T g);
    }

}
