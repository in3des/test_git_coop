package codewars;

import java.util.*;

public class TheHungerGamesZooDisaster {

    static List<String> animals = new ArrayList<>();
    static String ANIMAL;

    static {
        animals.add("fox chicken");
        animals.add("fox sheep");
        animals.add("antelope grass");
        animals.add("big-fish little-fish");
        animals.add("bug leaves");
        animals.add("bear big-fish");
        animals.add("bear bug");
        animals.add("bear chicken");
        animals.add("bear cow");
        animals.add("bear leaves");
        animals.add("bear sheep");
        animals.add("chicken bug");
        animals.add("cow grass");
        animals.add("giraffe leaves");
        animals.add("lion antelope");
        animals.add("lion cow");
        animals.add("panda leaves");
        animals.add("sheep grass");
    }


    public static String[] whoEatsWho(final String zoo) {
        // Your code here
        List<String> eaten = new ArrayList<>();
        eaten.add(zoo);

        String[] check = zoo.split(",");
        ArrayList<String> check2 = new ArrayList<>();
        for (String s:check) {
            check2.add(s);
        }
//        check2 = Arrays.asList(zoo.split(","));
        check2.trimToSize();

        int i=0;
        int j=0;

        Iwanthere:




//        for (; i < check2.size(); ) {
//while (check2.size() != 1) {

while (j<1000) {

            ANIMAL = check2.get(i);

            for (String z_list : animals) {
                String[] z_split = z_list.split(" ");
                if (check2.get(i).equals(z_split[0])) {
                    if (i == 0) {
                        if (check2.get(i + 1).equals(z_split[1])) {
                            eaten.add(z_split[0] + " eats " + z_split[1]);
                            check2.remove(i + 1);
//                            check2.trimToSize();
                            i=0;
                            continue Iwanthere;
                        }

                    } else {
                        if ((i + 1) < check2.size()) {
                            if (check2.get(i + 1).equals(z_split[1])) {
                                eaten.add(z_split[0] + " eats " + z_split[1]);
                                check2.remove(i + 1);
//                            check2.trimToSize();
                                i = 0;
                                continue Iwanthere;
                            }

                        }
//                    else if (i != 0) {
                            if (check2.get(i - 1).equals(z_split[1])) {
                                eaten.add(z_split[0] + " eats " + z_split[1]);
                                check2.remove(i - 1);
//                            check2.trimToSize();
                                i = 0;
                                continue Iwanthere;
                            }
//                        }
                    }
                }

            }
    if (i < check2.size()-1) i++;
    j++;
        }

        for (String s:check2) {
            eaten.add(s);
        }
        return eaten.toArray(new String[eaten.size()]);


    }

    public static void main(String[] args) {

//        final String input = "fox,bug,chicken,grass,sheep";
        final String input = "fox,bug,bear,chicken,grass,sheep";
//        final String input = "fox,grass,sheep";
//        final String input = "fox,chicken,grass,sheep";

        Arrays.stream(whoEatsWho(input)).forEach(System.out::println);

    }

}


//public class ExampleTest {
//
//    @Test
//    public void example() {
//        final String input = "fox,bug,chicken,grass,sheep";
//        final String[] expected = 	{
//                "fox,bug,chicken,grass,sheep",
//                "chicken eats bug",
//                "fox eats chicken",
//                "sheep eats grass",
//                "fox eats sheep",
//                "fox"};
//        assertArrayEquals(expected, Dinglemouse.whoEatsWho(input));
//    }
//
//}