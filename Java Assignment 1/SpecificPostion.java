public class SpecificPostion{
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40};
        int value = 25;
        int position = 2;
        int[] newArray = new int[original.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < position) {
                newArray[i] = original[i];
            } else if (i == position) {
                newArray[i] = value;
            } else {
                newArray[i] = original[i - 1];
            }
        }
        System.out.print("New array after insertion: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

