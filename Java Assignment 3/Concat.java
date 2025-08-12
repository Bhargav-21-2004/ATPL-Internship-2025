public class Concat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Java";
        long start1 = System.nanoTime();
        String result1 = s1 + s2 + s3;
        long end1 = System.nanoTime();
        System.out.println("Using + operator: " + result1);
        System.out.println("Time taken using (+): " + (end1 - start1) + " ns");
        long start2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        sb.append(s3);
        String result2 = sb.toString();
        long end2 = System.nanoTime();
        System.out.println("Using StringBuilder: " + result2);
        System.out.println("Time taken  using (StringBuilder): " + (end2 - start2) + " ns");
        long start3 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        sbf.append(s1);
        sbf.append(s2);
        sbf.append(s3);
        String result3 = sbf.toString();
        long end3 = System.nanoTime();
        System.out.println("Using StringBuffer: " + result3);
        System.out.println("Time taken using  (StringBuffer): " + (end3 - start3) + " ns");
    }
}
