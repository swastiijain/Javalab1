public class bikers {

        public static void main(String[] args) {
            //System.out.println("Hello" );
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter employ number:");
//        int emp_no = scan.nextInt();
//
//        System.out.println("Enter basic slary:");
//        int basic = scan.nextInt();
//
//        System.out.println("Enter Employ name:");
//        String str = scan.nextLine();
            double basic = 25000,CCA = 240,gross ,net;
            double PT=100;
            double DA = (0.7 * basic) ;
            double HRA = 0.3 * basic ;
            double PF = 0.1 * basic ;
            gross = DA + HRA + basic + CCA ;
            net = gross - PF - PT;
            System.out.println("Net salary is "+net);
            System.out.println("Gross salary is "+gross);

//Five Bikers Compete in a race such that they drive at
//a constant speed which may or may not be the same as
//the other. To qualify the race, the speed of a racer must
//be more than the average speed of all 5 racers. Write a
//Java program to take as input the speed of each racer
//and print back the speed of qualifying racers
            double s1,s2,s3,s4,s5,avg;
            s1 = 20;
            s2 = 20;
            s3 = 20;
            s4 = 20;
            s5 = 20;
            avg = (s1+s2+s3+s4+s5)/5 ;
            if(s1>avg)
                System.out.println("The winner is"+s1);
            if(s2>avg)
                System.out.println("The winner is"+s2);
            if(s3>avg)
                System.out.println("The winner is"+s3);
            if(s4>avg)
                System.out.println("The winner is"+s4);
            if(s5>avg)
                System.out.println("The winner is"+s5);
            else
                System.out.println("No one is qualified");

//ATM
            double a=0.5,w=0.5,n=2000-0.5-w;
            if(w%5==0 && n>0){

                System.out.println("amount is "+a);
                System.out.println("Withdrawl is "+w);
                System.out.println(("Amount after withdrawl is "+n));
            }
            else {
                System.out.println("amount is "+a);
                System.out.println("withdrawl is 0");
            }
   }

}
