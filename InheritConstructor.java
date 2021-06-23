public class InheritConstructor {
    public static void main(String[] args) {
        Child c=new Child();
        Parent p=new Parent();
    }
}
class Parent{
    public Parent(){
        System.out.println("Prarent Constructor");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child consructor");
    }}
