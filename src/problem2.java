import java.util.Scanner;

public class problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a(the number of odd number you want) : ");
        int a = sc.nextInt();

        int number = 1;
        int printed= 0;

        while(printed < a){
            System.out.print(number);
            printed++;
            number += 2;

            if(printed < a){
                System.out.print(" ,");
            }
        }
        sc.close();
    }

}
