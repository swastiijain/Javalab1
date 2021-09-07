public class IfSample {
    public static void main(String[] args) {
        int x=0,y=0;
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
int t,count=0;
int hi=0,sum=0;
       while(hi<11) {
           for (t = 0; t < 100; t = t + 1) {
               x = x + 2;
               y = y - 1;
               if (x + y == 100)
                   count = count + 1;
           }
           sum=count+1;
       }
        System.out.println("crossing="+hi);
    }
}
