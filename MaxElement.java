public class MaxElement {

    public static void main(String[] args) {
        int[] arr = {1,3,23,8,18};

        max(arr);
    }
    public static void max(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
            {
               max = arr[i];
            }
        }
        return max;
    }
}