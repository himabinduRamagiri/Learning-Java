public class classobject1 {
    int level;
    String name;

    void method1()
    {
        System.out.println(name + " is beautiful. ");
    }
    
    void method2()
    {
        System.out.println(name + " is smart. ");
    }

    public static void main(String args[]){
    classobject1 obj1 = new classobject1();
    obj1.level=1;
    obj1.name= "hima";
    System.out.println(obj1.level + " " + obj1.name);
    obj1.method1();
    obj1.method2();

    classobject1 obj2 = new classobject1();
    obj2.level=2;
    obj2.name= "bindu";
    System.out.println(obj2.level + " " + obj2.name);
    obj2.method1();
    obj2.method2();

}
}

