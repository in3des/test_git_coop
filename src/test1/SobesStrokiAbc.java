package test1;

import java.util.ArrayList;
import java.util.Arrays;

public class SobesStrokiAbc {

//isOneEditApart("abc", "bbc") -> true;
//isOneEditApart("abc", "dabc") -> true;
//isOneEditApart("abc", "ac") -> true;
//isOneEditApart("abc", "abc") -> false;
//isOneEditApart("abc", "cab") -> false;
//isOneEditApart("abcd", "abd") -> true;

        public static void main(String[] args) {
            SobesStrokiAbc test = new SobesStrokiAbc();
            System.out.println(test.isOneEditApart("abc", "abb"));
            System.out.println(test.isOneEditApart("abc", "dabc"));
            System.out.println(test.isOneEditApart("abc", "ac"));
            System.out.println(test.isOneEditApart("abc", "abc"));
            System.out.println(test.isOneEditApart("abc", "cab"));
            System.out.println(test.isOneEditApart("abcd", "abd"));
        }

        public boolean isOneEditApart(String first, String second) {
            boolean b = false;
            if (first.equals(second)) return false;

            ArrayList<String> tempFirstArray = new ArrayList<>(Arrays.asList(first.split("")));
            ArrayList<String> firstArr = new ArrayList<>(Arrays.asList(first.split("")));
            ArrayList<String> tempSecondArray = new ArrayList<>(Arrays.asList(second.split("")));
            ArrayList<String> secondArr = new ArrayList<>(Arrays.asList(second.split("")));

            if (Math.abs(second.length() - first.length()) == 1) {
                if (second.contains(first)) return true;
                if (firstArr.size() > secondArr.size()) {
                    tempFirstArray.removeAll(secondArr);
                    firstArr.removeAll(tempFirstArray);
                    return Arrays.equals(firstArr.toArray(), secondArr.toArray());
                }

            } else {
                if (first.contains(second)) return true;
                if(firstArr.size() < secondArr.size()) {
                    tempSecondArray.removeAll(firstArr);
                    secondArr.removeAll(tempSecondArray);
                    return Arrays.equals(firstArr.toArray(), secondArr.toArray());
                }
            }

            String [] firstArray = first.split("");
            String [] secondArray = second.split("");

            int count = 0;
            for (int i = 0; i < firstArray.length; i++) {
                if(!firstArray[i].equals(secondArray[i])){
                    count++;
                }
            }
            if(count == 1) b = true;

            return b;
        }
}
