import java.util.*;
import java.io.*;
class Read{
    public static void readFile(String filename) throws IOException
    {
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = reader.readLine())!= null) 
    {
    	System.out.println(line);
    }
    reader.close();;
} 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine(); 
        try{
            readFile(st);
        }
        catch(IOException e){
        System.out.println("file not found");
        System.out.println("the text file:"+ e.getMessage());
        }
    }
}