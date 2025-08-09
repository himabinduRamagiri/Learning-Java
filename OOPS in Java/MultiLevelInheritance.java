class GrandParentClass{
        void vehicle(){
            System.out.println("vehicles move on the road and are used for transportation.");
        }
    }
class ParentClass extends GrandParentClass{
        void car(){
            System.out.println("Cars are 4 wheelers");
        }
    }
class childClass extends ParentClass{
        void BMW(){
            System.out.println("BMW is a german car");
        }
    }

public class MultiLevelInheritance{
    public static void main(String []args){
        childClass obj1 = new childClass();
        obj1.BMW();
        obj1.car();
        obj1.vehicle();

    }
}