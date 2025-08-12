public class Analysis {
    public static void main(String[] args) {
        String sentence = "Learning Java is fun and interesting";
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        System.out.println("Total number of words: " + wordCount);
        int firstIndex = sentence.indexOf('i');
        int lastIndex = sentence.lastIndexOf('i');
        System.out.println("First occurrence of 'i': " + firstIndex);
        System.out.println("Last occurrence of 'i': " + lastIndex);
        boolean startsWithLearn = sentence.startsWith("Learn");
        System.out.println("Starts with 'Learn': " + startsWithLearn);
        boolean endsWithIng = sentence.endsWith("ing");
        System.out.println("Ends with 'ing': " + endsWithIng);
    }
}



