import java.sql.SQLOutput;
import java.util.Scanner;

public class cn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=0;
        System.out.println("Hello");
        System.out.print("Hello ");
        System.out.println("user");
         int i = 4;
         int j = 5;
         int sum = i + j;
        System.out.print("sum of "+i);
        System.out.print(" and "+j);
        System.out.println(" is " +sum );

        System.out.print("Enter your name:");
        String str = scan.nextLine();
        System.out.println("Hello "+str);
        System.out.println("Enter password:");
        String pa = scan.nextLine();

            //Simple interest calculator
            System.out.print("Enter Principal:");
            int p = scan.nextInt();
            System.out.print("Enter r:");
            int r = scan.nextInt();
            System.out.print("Enter t:");
            int t = scan.nextInt();
            int SI = (p * r * t) / 100;
            System.out.println("Simple interest is " + SI);

            System.out.println("Enter your age:");
            int age = scan.nextInt();
            if(age>=18)
                System.out.println("You are eligible to vote");
            else
                a = 18 - age;
                System.out.print("Sorry you are not eligible to vote,come back after years "+a);
                System.out.println(" years");


    }
}


