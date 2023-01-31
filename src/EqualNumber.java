//Count the equal numbers present in string from the List i.e 1100
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualNumber {
    public static void main(String[] args) {
        List<String> numberList = new ArrayList<>();
        numberList.addAll(Arrays.asList("0000", "0001", "0011", "0111", "1111", "1110", "1100", "1000"));
        countNum(numberList);

    }

    public static void countNum(List<String> numberList) {

        for (int i = 0; i < numberList.size(); i++) {
            String str = numberList.get(i);
            int oneCount = 0;
            int zeroCount = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == '0') {
                    zeroCount++;
                } else if (str.charAt(j) == '1') {
                    oneCount++;
                }
            }

            if (zeroCount == oneCount) {
                System.out.println(str);
            }
        }
    }
}
