import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr ={10,9,8,7,6,5,4,3,2,1};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();

        System.out.println(linear(arr,num));

        }

        public static int linear(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return  i;
            }
        }
        return -1;

        }
    }


