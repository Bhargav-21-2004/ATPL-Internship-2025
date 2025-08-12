public class Reverse {
    public static void main(String[] args) {
        String name ="Bhargav";
        String reversed1 = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed1 += name.charAt(i);
        }
        System.out.println("Reversed using String: " + reversed1);
        StringBuilder sb = new StringBuilder(name);
        String reversed2 = sb.reverse().toString();
        System.out.println("Reversed using StringBuilder: " + reversed2);
        StringBuffer sbf = new StringBuffer(name);
        String reversed3 = sbf.reverse().toString();
        System.out.println("Reversed using StringBuffer: " + reversed3);
    }
}
