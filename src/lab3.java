
//class student{
//    double sub1,sub2,sub3,sub4,sub5;
//}
class box {
    double height, width, length;

    double volume() {
        return height * width * length;
    }
}
void setvalues(double o,double b,double c){
        height = o;
        width = b;
        length = c;

    }
public class lab3 {
    public static void main(String[] args) {
       box a = new box(o:10,b:10,c:10);
//        box c = new box();
//        a = c;
//        a.height = 10;
//        a.width = 10;
//        a.length = 10;
       // setvalues b= new setvalues(o:10,b:10,c:10);

        //double vol = b.volume();
        //double volume = c.height * c.width *c.length;
        System.out.println(a.volume());
        //System.out.println();
//        System.out.println(volume);
//        student s = new student();
//        s.sub1 = 78;
//        s.sub2 =96;
//        s.sub3 = 56;
//        s.sub4 = 56;
//        s.sub5 = 98;
//        double average = (s.sub1 + s.sub2 + s.sub3 + s.sub4 +s.sub5)/5;
//        System.out.print("Average marks =");
//        System.out.println(average);
    }

}
