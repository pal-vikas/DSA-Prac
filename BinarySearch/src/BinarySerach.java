import java.util.Scanner;

public class BinarySerach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for array : ");
        int n = sc.nextInt();

        System.out.print("Enter the elements in array : ");
        int[] arr = new int[n];

        System.out.print("Enter the elements in array : ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the elements you want to search from array : ");
        int search = sc.nextInt();

        System.out.println(BinarySearch(arr, search));

    }

    static int BinarySearch(int[] arr, int search) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == search) {
                return mid;
            }
            else if (search > arr[mid]) {
                low = mid + 1;
            }
            else if (search < arr[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
