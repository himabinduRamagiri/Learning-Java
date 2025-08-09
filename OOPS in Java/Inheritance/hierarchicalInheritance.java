class parent{
    void car(){
    System.out.println("car is a 4 wheeler.");
}
}
class child1 extends parent{
    void BMW(){
    System.out.println("BMW costs 100k.");
}
}
class child2 extends parent{
    void Audi(){
    System.out.println("Audi costs 200k.");
}
}
class child3 extends parent{
    void Benz(){
    System.out.println("Benz costs 300k.");
}
}

public class hierarchicalInheritance {
    public static void main(String []args){
        child1 obj_BMW = new child1();
        obj_BMW.BMW();
        obj_BMW.car();

        child2 obj_Audi = new child2();
        obj_Audi.Audi();
        obj_Audi.car();

        child3 obj_Benz = new child3();
        obj_Benz.Benz();
        obj_Benz.car();

    }
}
