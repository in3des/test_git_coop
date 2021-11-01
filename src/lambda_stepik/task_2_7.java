package lambda_stepik;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class task_2_7 {

    public static void main(String[] args) {

        Double a1 = 2D;
        Double b1 = 3D;
        Double c1 = 4D;



        Four<Double> calc1 = (a, b, c, x) -> a*x*x + b*x + c;

        System.out.println(calc1.FourCalc(a1, b1, c1, 4D));


    }

    @FunctionalInterface
    interface Four<T> {
        Double FourCalc (T a, T b, T c, T d);
    }

}
