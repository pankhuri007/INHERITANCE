public class MethodOverridingDemo2 {
    public static void main(String[] args) {
       TV t=new TV();
       t.changeChannel();
       t.changeChannel();
       TV t1=new SmartTv();
       t1.changeChannel();
       t1.switchOn();
       SmartTv tv=new SmartTv();
       tv.changeChannel();
       tv.switchOn();
       tv.browse();

    }
}
class TV{
    public void switchOn(){
        System.out.println("TV is Switch On");
    }
    public void changeChannel(){
        System.out.println("TV channel is changed");
    }
}
class SmartTv extends TV{
    @Override
    public void switchOn(){
        System.out.println("Smart Tv is switche on");
    }

    @Override
    public void changeChannel() {
        System.out.println("Smart tv channel is changed");
    }
    public void browse(){
        System.out.println("Smart tv is browsing");
    }
}
