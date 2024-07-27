package accenturePractice;

public class RevLineString {
        public static String reverseSentence(String sentence) {
            // Split the sentence into words
            String[] words = sentence.split(" ");

            // Reverse the order of words
            StringBuilder reversed = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }

            // Convert StringBuilder to String and trim trailing space
            return reversed.toString().trim();
        }
    public static void main(String[] args) {
        String sentence = "hello Sreesa lpu";
        System.out.println(reverseSentence(sentence));
    }

}
