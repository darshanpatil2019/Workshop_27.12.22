//Print the String value which have double values from given Array
public class NumberCount {
    public static void main(String[] args) {
        String[] array = {"0000", "0001", "0011", "0111", "1111", "1110", "1100", "1000"};
        countNum(array);
    }

    public static void countNum(String[] array) {
        for (String str : array) {
            int zeroCount = 0;
            int oneCount = 0;
//
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    zeroCount++;
                } else if (str.charAt(i) == '1') {
                    oneCount++;
                }
            }
            if (zeroCount == oneCount) {
                System.out.println(str);
            }
        }
    }
}
