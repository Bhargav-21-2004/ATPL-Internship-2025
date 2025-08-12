import java.util.*;
public class SecondLargest
{
public static void main(String[] args) {
int array[] = {10,5,20,8,15};
Arrays.sort(array);
int len = array.length;
System.out.println(array[len-2]);
}
}