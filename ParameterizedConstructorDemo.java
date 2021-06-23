public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Child1 c=new Child1();
        Child1 c1=new Child1(10,20);
    }

}
class Parent1{
    Parent1(){
        System.out.println("non params in tihs Constructor");
    }
    Parent1(int x){
        System.out.println("params in this constructor");
    }
}
class Child1 extends Parent1{
    Child1(){
        System.out.println("child");
    }
    Child1(int x,int y){
        super(x);
        System.out.println("paramterized child");
    }


}