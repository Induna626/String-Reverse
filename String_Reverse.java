public class String_Reverse {
    public static void main(String[] args) {
        String sentence = "Mpumelelo";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\b");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);
            reversedSentence.append(words[i]);
        }

        return reversedSentence.toString();
    }

    public static String reverseString(String word) {
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        return reversedWord;
    }
}