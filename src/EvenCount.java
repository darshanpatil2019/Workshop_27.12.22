//Count the number 1 which is present at even position
public class EvenCount {
    public static void main(String[] args) {
        String[] array = {"0000", "0001", "0011", "0111", "1111", "1110", "1100", "1000"};
        evenCount(array);
    }

    public static void evenCount(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String str = array[i];

            for (int j = 0; j < str.length(); j = j + 2) {
                if (str.charAt(j) == '1') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
