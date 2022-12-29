// Print the number on position 0 to 1 & on position 1 to 0
public class SwapNumber {
    public static void main(String[] args) {
        String[] number = {"0000", "1111", "1100", "0011", "1010", "0101"};
        stringNumber(number);

    }

    public static void stringNumber(String[] number) {
        String newString = "";
        for (int i = 0; i < number.length; i++) {
            String str = number[i];
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0') {
                    newString = newString + "1";
                } else {
                    newString = newString + "0";
                }
            }
            newString = newString + " ";
        }
        System.out.println(newString);
    }
}
