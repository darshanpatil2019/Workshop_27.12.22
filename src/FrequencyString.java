import java.util.Scanner;

//Count a specific character present in array given by user
public class FrequencyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = {"darshan", "sanjay", "patil", "pune", "bridgelabz"};
        //System.out.println("Enter a String : ");
        //String str = sc.nextLine().toLowerCase();
        System.out.println("Enter a character : ");

        char alphabet = sc.nextLine().toLowerCase().charAt(0);
        occurrenceAlphabet(array, alphabet);
    }

    public static void occurrenceAlphabet(String[] array, char alphabet) {
        int occurrence = 0;
        for (int i = 0; i < array.length; i++) {
            String str = array[i];

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == alphabet) {
                    occurrence++;
                }
            }


        }
        if (occurrence == 0) {
            System.out.println("Alphabet is not present");
        } else System.out.println("Occurrence of Given Alphabet is : " + occurrence);
    }
}
