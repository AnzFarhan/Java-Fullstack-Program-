public class methodsDemo {
    public static void main(String[] args) {
        String text = "Java is popular programming language";

        // 1. length() 
        System.out.println("Length of sampleText: " + text.length());

        // 2. charAt(index)
        System.out.println("Character at index 5: " + text.charAt(5));

        // 3. contains(CharSequence sequence)
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 4. indexOf(String str)
        System.out.println("Index of first occurrence of 'Java': " + text.indexOf("Java"));

        // 5. lastIndexOf(String str)
        System.out.println("Index of last occurrence of 'Java': " + text.lastIndexOf("Java"));

        // 6. substring(int beginIndex, int endIndex)
        System.out.println("Substring from index 0 to 4: " + text.substring(0, 4)); // "Java"

        // 7. replace(CharSequence target, CharSequence replacement)
        String replacedText = text.replace("Java", "Python");
        System.out.println("Replaced 'Java' with 'Python': " + replacedText);

        // 8. split(String regex)
        String[] words = text.split(" ");
        System.out.println("Words in sampleText:");
        for (String word : words) {
            System.out.println(word);
        }

        // 9. Trim and convert to lowercase
        String trimmedText = "   Hello World!   ";
        System.out.println("Trimmed text: '" + trimmedText.trim() + "'");
        System.out.println("Lowercase text: '" + trimmedText.toLowerCase() + "'");
    }
}
