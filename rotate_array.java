import java.util.Scanner;

/**
 * Problem: Rotate Array
 * Input:
 * 1
 * 77 69
 * 40 13 27 87 95 40 96 71 35 79 68 2 98 3 18 93 53 57 2 81 87 42 66 90 45 20 41 30 32 18 98 72 82 76 10 28 68 57 98 54 87 66 7 84 20 25 29 72 33 30 4 20 71 69 9 16 41 50 97 24 19 46 47 52 22 56 80 89 65 29 42 51 94 1 35 65 25
 * 
 * Output: 
 * 29 42 51 94 1 35 65 25 40 13 27 87 95 40 96 71 35 79 68 2 98 3 18 93 53 57 2 81 87 42 66 90 45 20 41 30 32 18 98 72 82 76 10 28 68 57 98 54 87 66 7 84 20 25 29 72 33 30 4 20 71 69 9 16 41 50 97 24 19 46 47 52 22 56 80 89 65
 */
public class Rotate_Array {
    static Scanner input = new Scanner(System.in);

    static int[] getRotatedArray(int arr[], int rotate) {
        int result[] = new int[arr.length];
        int x = 0, i = rotate;
        
        while (true) {

            result[x++] = arr[i];

            i = i == arr.length -1 ? 0 : i + 1;

            if (i == rotate)
                break;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int testCase = input.nextInt();

        while (testCase-- > 0) {
            int n = input.nextInt();
            int rotate = input.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = input.nextInt();

            int rotatedArr[] = getRotatedArray(arr, rotate);

            for (int val : rotatedArr)
                System.out.print(val + " ");

            // This is End    
        }
    }
}