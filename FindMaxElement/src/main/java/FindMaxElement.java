public class FindMaxElement {

    public static void main(String[] args) {

        int[] arr = {1,23,4,34,243,5};
        System.out.println(findMax(arr));
    }
     static int findMax(int[] arr) {
        int maxElement = arr[0];
        for(int i=1;i<arr.length ; i++)
        {
            if (maxElement < arr[i])
            {
                maxElement = arr[i];
            }
        }
        return maxElement;

    }
}
