//Replace the word in string by another word
//Use split function

public class ReplaceWord {
    public static void main(String[] args) {
        myReplace("My Pet Name is Moti", "Dog", "Moti");
    }

    public static void myReplace(String sentence, String replaceWord, String replaceWith) {
        String[] words = sentence.split("\\s");
        String finalSentence = " ";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(replaceWith)) {
                words[i] = replaceWord;
            }

            finalSentence = finalSentence + words[i] + " ";
        }
        System.out.println(finalSentence);
    }
}
