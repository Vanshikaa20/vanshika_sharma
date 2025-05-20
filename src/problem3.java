import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            a = a - 1;
        }

        for (int i = 1; i <= a; i += 2) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(", " + i);
            }
        }
    }
}

