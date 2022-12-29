//Count the character present in character array into String array

public class CountCharacter {
    public static void main(String[] args) {
        String[] array = {"darshan", "sanjay", "patil", "bridgelabz"};
        char[] chars = {'a', 'e', 'i', 'o', 'u', 'm', 'z'};
        countElement(array, chars);
    }

    public static void countElement(String[] array, char[] chars) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < chars.length; k++) {
                    if (str.charAt(j) == chars[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
