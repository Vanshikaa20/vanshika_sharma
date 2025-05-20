import java.util.Scanner;

public class problem1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("enter first number a : ");
        double a  = sc.nextDouble();
        System.out.print("enter second number b : ");
        double b = sc.nextDouble();

        sc.nextLine();
        System.out.print("enter operation to perform : ");
        String op = sc.nextLine();

        calculator calc = new calculator();
        double result = calc.calculate(a,b,op);

        System.out.println("result : " + result);
    }

    static class calculator {
        double calculate(double a, double b , String op){
            switch (op.toLowerCase()){
                case "add":
                    return a+b;
                case "sub":
                    return a-b;
                case "mul":
                    return a*b;
                case "div":
                    if(b==0){
                        System.out.println("error: division by zero is not possible.");
                        return 0;
                    }
                    return a/b;
                default:
                    System.out.println("inavlid input");
                    return 0;

            }
        }
    }
}
