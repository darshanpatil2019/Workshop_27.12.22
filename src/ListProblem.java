//Count the character present in list from the given array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListProblem {
    public static void main(String[] args) {

        List<String> hobbiesList = new ArrayList<>();
        hobbiesList.addAll(Arrays.asList("Trekking", "Reading", "Cricket", "Travelling", "Eating"));
        char[] chars = {'a', 'e', 'I', 'O', 'u', 's'};

        countCharacter(hobbiesList, chars);
    }

    public static void countCharacter(List<String> hobbiesList, char[] chars) {
        int count = 0;
        for (int i = 0; i < hobbiesList.size(); i++) {
            String str = hobbiesList.get(i).toLowerCase();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < chars.length; k++) {
                    if (str.charAt(j) == Character.toLowerCase(chars[k])) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Count of characters present in List = " + count);
    }
}
