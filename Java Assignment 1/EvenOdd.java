public class EvenOdd{
public static void main(String[] args) {
int[] arr = {1, 2, 3, 4, 5,6};
int evenCount = 0, oddCount = 0;
for (int num : arr) {
if (num % 2 == 0)
evenCount++;
else
oddCount++;
}
System.out.println("Even count:"+evenCount);
System.out.println("Odd count:"+oddCount);
}
}