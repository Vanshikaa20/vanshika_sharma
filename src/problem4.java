import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample input array as per example given (you can modify or take input)
        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        System.out.print("{");
        for (int divisor = 1; divisor <= 9; divisor++) {
            int count = 0;
            for (int num : arr) {
                if (num % divisor == 0) {
                    count++;
                }
            }
            System.out.print(divisor + ": " + count);
            if (divisor != 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
