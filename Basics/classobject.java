public class classobject {
    int rollnumber;
    String name;

    public void insertData(int r, String n)
    {
        rollnumber =r;
        name = n; 
    }

    public void printData()
    {
        System.out.println("name : "+name+" roll number : "+ rollnumber);
    }
    
public static void main(String args[])
{
    classobject obj1 = new classobject();
    classobject obj2 = new classobject();
    classobject obj3 = new classobject();

    obj1.insertData(1, "hima");
    obj1.printData();
    obj2.insertData(2, "bunny");
    obj2.printData();
    obj3.name= "Krishna";
    obj3.rollnumber = 3;
    obj3.printData();
    }

}
