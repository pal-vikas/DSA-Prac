import java.util.Arrays;

public class SwapArrayElement {
    public static void main(String[] args) {

        System.out.println("Vikas Pal");
    int[] arr = {1,2,3,4,5,6};
        System.out.println("Before Swapping");
        System.out.println(Arrays.toString(arr));
        swap(arr,2,5);

        System.out.println("After Swapping");
        System.out.println(Arrays.toString(arr));
    }
    //This method is for swapping
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
