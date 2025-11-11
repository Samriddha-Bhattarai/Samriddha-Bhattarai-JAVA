import java.util.Scanner;
abstract class shape{
    int a;
    int b;
    abstract void printarea();
}
class rectangle extends shape{
    rectangle (int x, int y){
        a=x;
        b=y;
    }
    void printarea(){
        System.out.println("Area of rectangle ="+(a*b));
    }
}
class triangle extends shape{
    triangle (int x, int y){
        a=x;
        b=y;
    }
    void printarea(){
        System.out.println("Area of triangle="+(a*b*0.5));
    }
}
class circle extends shape{
    circle(int r){
        a=r;
    }
    void printarea(){
        System.out.println("Area of circle=" + (Math.PI*a*a));
    }
}
public class lab4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shape s;
        System.out.println("Enter the dimensions of the rectangle: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        s = new rectangle(a,b);
        s.printarea();

        System.out.println("Enter the dimensions of triangle: ");
        int c= sc.nextInt();
        int d= sc.nextInt();
        s = new triangle(c,d);
        s.printarea();
         System.out.println("Enter the dimensions of circle: ");
          int o= sc.nextInt();
        s = new circle(o);
        s.printarea();
    }

}
