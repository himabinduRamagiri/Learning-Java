interface A{
    default void fun(){
        System.out.println("Hello from A");
    }
}
interface B{
    default void fun(){
        System.out.println("Hello from B");
    }
}
class C implements A,B{
    public void fun(){
        System.out.println("Hello from C");
    }
}

public class multipleInheritance {
    public static void main(String args[]){
        C obj = new C();
        obj.fun();
    }
    
}
