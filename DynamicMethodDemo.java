public class DynamicMethodDemo {
    public static void main(String[] args) {
        Super1 s1=new Sub1();// this dynamic method dispatch in parent reference is taken to call child object and only those methods are call which are overrriden in child class
        s1.meth1();
        s1.meth2();
        Sub1 sb=new Sub1();
        sb.meth3();
    }

}
class Super1{
    public void meth1(){
        System.out.println("Super meth1");
    }
    public void meth2(){
        System.out.println("Super meth2");
    }
}
class Sub1 extends Super1{
    public void meth1(){
        System.out.println("sub meth1");
    }
    public void meth3(){
        System.out.println("sub meth3");
    }
}
