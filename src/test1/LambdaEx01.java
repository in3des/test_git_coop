package test1;

public class LambdaEx01 {

    interface Condition {
        boolean isAppropriate(int n);
    }

    private static int sum(int[] numbers, Condition condition) {
        int result = 0;
        for (int i : numbers) {
            if (condition.isAppropriate(i)) {
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[] {0, 1, 0, 3, 0, 5, 0, 7, 0, 9}, (n) -> n < 6));
    }

}
