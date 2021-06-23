public class Circle {
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;

    }
    static class Cylinder extends Circle{
        public double height;
        public double volume(){
            return  area()*height;
        }
    }
}
class Result{
    public static void main(String[] args) {
        Circle.Cylinder c=new Circle.Cylinder();
        c.height=8;
        c.radius=9;
        System.out.println("Volume="+ c.volume());
        System.out.println("Area="+ c.area());
    }
}
