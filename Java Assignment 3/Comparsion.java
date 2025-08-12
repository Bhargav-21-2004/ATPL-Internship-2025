public class Comparsion {
    public static void main(String[] args) {
        String str1="JAVA";
        String str2="java";
        System.out.println("equals: " + str1.equals(str2));
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));
        System.out.println("compareTo: " + str1.compareTo(str2));
    }
}