//Search how many times the given string present in List

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringProblem {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Enjoyment", "happy", "measurement", "adjustment", "life", "song", "status", "moment", "temperament", "Mentor", "Mentalist"));
        String string = "Ment";
        countString(list, string);

    }

    public static void countString(List<String> list, String string) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.toLowerCase().contains(string.toLowerCase())) {
                count++;
            }
        }
        System.out.println("Count of given String in list is : " + count);
    }
}
