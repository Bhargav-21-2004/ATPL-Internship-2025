public class Method {
    public static void main(String[] args) {
        String input = " Java Programming";
        String trimmed = input.trim();
        System.out.println("After trimming: '" + trimmed + "'");
        System.out.println("Lowercase: " + trimmed.toLowerCase());
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        String withDashes = trimmed.replace("", "-");
        System.out.println("Replaced with dashes: " + withDashes);
        String sub1 = trimmed.substring(0, 4);  
        String sub2 = trimmed.substring(2);      
        System.out.println("Substring 1 (0-4): " + sub1);
        System.out.println("Substring 2 (5-end): " + sub2);
        int indexA = trimmed.indexOf("a");
        System.out.println("First index of 'a': " + indexA);
    }
}


