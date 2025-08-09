class parentClass{
        void car(){
            System.out.println("Cars are 4 wheelers");
        }
    }
     class childClass extends parentClass{
        void BMW(){
            System.out.println("BMW is a german car");
        }

    }

public class singleInheritance {
    public static void main(String args[]){
        childClass obj= new childClass();
        obj.car();
        obj.BMW();

    }
}
