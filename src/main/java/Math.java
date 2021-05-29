import java.util.Scanner;

public class Math {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String string1 = input1.next();
        int num1 = Integer.parseInt(string1);

        Scanner input2 = new Scanner(System.in);
        System.out.print("What is the second number? ");
        String string2 = input1.next();
        int num2 = Integer.parseInt(string2);

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        int quo = num1 / num2;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", num1, num2, sum, num1, num2, diff, num1, num2, prod, num1, num2, quo);
    }
}
