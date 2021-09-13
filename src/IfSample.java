//import java.util.Scanner;
/* x=10;
        y=20;
        if(x<y)
            System.out.println("X is less than Y");
        else
            System.out.println("Y is greater than X");
        for(x=0;x<=10;x=x+1)
        {
            System.out.println("X is =" +x);
            y=y-2;
            System.out.println("Y is reducing to ="+y);
        }*/
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();*/
public class IfSample {
    public static void main(String[] args) {


float x=0,y=100;
float count=0;
float sum=0;
for(int i=0;i<100;i++)
                {
                   if(x+y==100) {
                       count = count + 1;
                       System.out.print(+x);
                       System.out.print(" ");
                       System.out.println(+y);
                       sum = count + 1;
                   }
                    x = x + i+1;
                    y = y - i;
               }



        System.out.println("crossing="+sum);
    }
}
