package Basics;

public class MethodOverload {
    public static void main(String[] args) {
        double circle=area(4);
        System.out.println("Area of circle: "+circle);
        double rectangle=area(5,4);
        System.out.println("Area of Rectangle: "+rectangle);
    }
    public static double area(double radius){
        if(radius <0)
        {
            return -1.0;
        }else{
            double pi = Math.PI;
            double carea=radius*radius*pi;
            return carea;
        }
    }
    public static double area(double x, double y){
        if(x <0 || y<0)
        {
            return -1;
        }else{
            double rarea=x*y;
            return rarea;}
    }

}
