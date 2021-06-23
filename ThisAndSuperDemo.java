public class ThisAndSuperDemo {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10,20);
        r1.display();
    }

}
class Rectangle{
    int length;
    int breath;
    Rectangle(int l,int b){
        this.length=l;
        this.breath=b;
    }
    void display(){
        System.out.println("Length: "+this.length);
        System.out.println("Breath: "+this.breath);
    }
}
