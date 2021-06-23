public class MethodOverridingDemo {
    public static void main(String[] args) {
      /*  Super sp=new Super();
        sp.display();
        Super.Sub su=new Super.Sub();
        su.display();*/
        Super sup=new Super.Sub();
        sup.display();

    }
}
class Super{
    public  void display(){
        System.out.println("Super class");
    }
    static class Sub extends Super{
        @Override
        public void display(){
            System.out.println("child Class");
        }
    }
}
