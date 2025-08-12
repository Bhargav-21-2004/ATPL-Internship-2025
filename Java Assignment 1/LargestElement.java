public class LargestElement
{
public static void main(String[] args) {
int array[] = {10,5,20,8,15};
int num=array[0];
for(int i=0;i<5;i++){
if(array[i]>num){
num=array[i];
}
}
System.out.println(num);
}
}